package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import Pages.HomePage;
import Pages.SearchResultPage;
import Pages.ShoppingCartPage;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderStepDef {
	
	WebDriver driver = TestBase.getDriver();
	HomePage homePage;
	SearchResultPage resultPage;
	ShoppingCartPage cartPage;
	
	public PlaceOrderStepDef() {
		homePage = new HomePage(driver);
		resultPage = new SearchResultPage(driver);
		cartPage = new ShoppingCartPage(driver);
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		TestBase.openUrl("https://danube-webshop.herokuapp.com/");
		
	}
	@When("User search an item {string}")
	public void user_search_an_item(String strItem) {
	    homePage.searchItem(strItem);
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
			Assert.assertTrue(resultPage.isItemListed());
	}
	@Given("User should be on Search result page")
	public void user_should_be_on_search_result_page() {
		resultPage.viewItemDetails();
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() {
		resultPage.addToCart();
	}
	@Then("Item must be added")
	public void item_must_be_added() {
		Assert.assertTrue(cartPage.isItemAdded());
	}
	@When("User do checkout")
	public void user_do_checkout() {
		cartPage.doCheckOut();
	}
	@Then("Should navigated to Checkout page")
	public void should_navigated_to_checkout_page() {
	    System.out.println("Item checkout successfully");
	}
}

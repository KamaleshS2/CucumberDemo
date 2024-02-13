package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(name = "searchbar")
	WebElement searchbar;
	
	@FindBy(id= "button-search")
	WebElement searchBtn;
	
	@FindBy(id = "cart")
	WebElement cartBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String srhitem) {
		searchbar.sendKeys(srhitem);
		searchBtn.click();
	}
	public void navigateToCartPage() {
		cartBtn.click();
	}
}

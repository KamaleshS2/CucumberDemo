package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	@FindBy(css = "ul li.preview")
	WebElement itemDetails;
	
	@FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
	WebElement addCartBtn;
	
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public boolean isItemListed() {
		return itemDetails.isDisplayed();
		
	} 
	public void viewItemDetails() {
		itemDetails.click();
	}
	public void addToCart() {
		addCartBtn.click();
	}
}

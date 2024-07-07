package Maven_Pacakage.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Wishlist_Page 
{
	WebDriver driver;
	
	@FindBy(linkText="Add to Cart")
	WebElement cart;
	
	@FindBy(linkText="Proceed to checkout")
	WebElement checkout;
	
	
	
	public void Cart_click()
	{
		cart.click();
	}
	
	public void Checkout_click()
	{
		checkout.click();
	}
	
	public Amazon_Wishlist_Page (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
}

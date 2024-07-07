package Maven_Pacakage.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page 
{
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement contin;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement signin;
	
	public void un()
	{
		username.sendKeys("Hemantdhoot0@gmail.com");
	}
	public void contin_click()
	{
		contin.click();
	}
	public void pwd()
	{
		password.sendKeys("Aakash7869@");
	}
	public void signin_click()
	{
		signin.click();
	}
	
	public Amazon_Login_Page(WebDriver driver)   //public constructor with para bcz caaling from different package
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}

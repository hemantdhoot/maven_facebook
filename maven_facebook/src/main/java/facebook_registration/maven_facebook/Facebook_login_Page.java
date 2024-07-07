package facebook_registration.maven_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_Page 
{
	WebElement driver;
	// step 1 : locate each element
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement click_login;
	
	// step 2: create separate method for each component
	
	public void un()
	{
		username.sendKeys("hemantdhoot0@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("12345678");
	}
	public void login()
	{
		click_login.click();
	}
	
	//step 3: initialize each element using pageFactory class inside constructor

	public Facebook_login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

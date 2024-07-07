package Maven_Pacakage.Selenium_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SerachResult_Page 
{
WebDriver driver;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement first_shoe;
	
	public void shoe()
	{
		first_shoe.click();		
		
	}
	
	public Amazon_SerachResult_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}

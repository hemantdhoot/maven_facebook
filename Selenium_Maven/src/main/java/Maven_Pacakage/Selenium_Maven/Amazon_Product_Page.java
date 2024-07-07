package Maven_Pacakage.Selenium_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Product_Page 
{
		WebDriver driver;
					
			@FindBy(name="submit.add-to-registry.wishlist")
			WebElement adding_wishlist;
			
		//	@FindBy(id="atwl-list-privacy-3DJZNRD16UBA2");
		//	WebElement wishlist;
			
			@FindBy(linkText="View Your List")
			WebElement view_List;
		
			
			public void wishlist()
			{
				adding_wishlist.click();
			}
			
		/*	public void view_wishlist1()
			{
				wishlist.click();
			}*/
			
			public void view_wishlist()
			{
				view_List.click();
			}
			
			public Amazon_Product_Page(WebDriver driver)   //public constructor with para bcz calling from different package
			{
				PageFactory.initElements(driver, this);
			}
}

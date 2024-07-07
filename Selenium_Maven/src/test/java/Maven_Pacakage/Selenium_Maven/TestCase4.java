package Maven_Pacakage.Selenium_Maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 
{
	@Test
	public void login_to_search_shoe_clickfirst_addwishlist_clickcart()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Amazon_Login_Page a1 = new Amazon_Login_Page(driver);
		a1.un();
		a1.contin_click();
		a1.pwd();
		a1.signin_click();
		
		Amazon_Home_Page a2 = new Amazon_Home_Page(driver);
		a2.searching();

		Amazon_SerachResult_Page a3= new Amazon_SerachResult_Page(driver);
		a3.shoe();
		
		Set <String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String Parentid = i1.next();
		String childid = i1.next();
		System.out.println(Parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		
		Amazon_Product_Page a4 = new Amazon_Product_Page(driver);
		a4.wishlist();
		a4.view_wishlist();
		
		Amazon_Wishlist_Page a5 = new Amazon_Wishlist_Page (driver);
		a5.Cart_click();
	}
}

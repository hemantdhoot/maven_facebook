package facebook_registration.maven_facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 
{
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Facebook_login_Page f1 = new Facebook_login_Page(driver);
		f1.un();
		f1.pwd();
		f1.login();
	}
}

package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import ObjectRepository.PageFactoryHomePage;
import ObjectRepository.PageFactoryLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryTestCases {

	@Test
	public void LoginTestCase()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		PageFactoryLogin login = new PageFactoryLogin(driver);
		login.Email().sendKeys("abc");
		login.Pass().sendKeys("abc");
		login.Go().click();
		login.Home().click();
		
		PageFactoryHomePage homepage = new PageFactoryHomePage(driver);
		homepage.SearchBox().sendKeys("abc");
		homepage.SearchButton().click();
	}
	
}

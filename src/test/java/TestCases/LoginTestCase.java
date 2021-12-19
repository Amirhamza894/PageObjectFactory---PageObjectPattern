package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import ObjectRepository.rediffHomePage;
import ObjectRepository.rediffLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {

	@Test
	public void Login() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rediffLogin rediff = new rediffLogin(driver);
		rediff.EmailId().sendKeys("abc");
		rediff.pass().sendKeys("abc");
		rediff.go().click();
		rediff.homepage().click();
		
		rediffHomePage rediffHome = new rediffHomePage(driver);
		rediffHome.home().sendKeys("abc");
		rediffHome.btn().click();
		driver.close();
		
	}

}

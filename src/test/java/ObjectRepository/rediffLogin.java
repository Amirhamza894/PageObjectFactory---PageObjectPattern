package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffLogin {

	WebDriver driver;
	
	public rediffLogin(WebDriver driver) {
		this.driver = driver;
	}

	By email = By.xpath("//input[@name='login']");
	By pass = By.xpath("//input[@name='passwd']");
	By go = By.xpath("//input[@name='proceed']");
	By homepage = By.xpath("//a[@class='f12']");

	public WebElement EmailId()
	{
		return driver.findElement(email);
	}
	
	public WebElement pass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement go()
	{
		return driver.findElement(go);
	}
	
	public WebElement homepage()
	{
		return driver.findElement(homepage);
	}
}






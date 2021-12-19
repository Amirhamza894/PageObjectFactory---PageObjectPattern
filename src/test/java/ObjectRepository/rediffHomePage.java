package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffHomePage {

	WebDriver driver;
	
	public rediffHomePage(WebDriver driver) {
		this.driver = driver;
	}


	
	By search = By.xpath("//input[@id='srchword']");
	By searchBtn = By.xpath("//div[@id = 'topsrchhome']/form/input");
	
	public WebElement home()
	{
		return driver.findElement(search);
	}
	
	public WebElement btn()
	{
		return driver.findElement(searchBtn);
	}
	
}






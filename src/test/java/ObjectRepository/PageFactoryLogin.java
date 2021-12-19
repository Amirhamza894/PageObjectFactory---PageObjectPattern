package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {

	WebDriver driver;
	
	public PageFactoryLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='login']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='passwd']")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement go;
	
	@FindBy(xpath="//a[@class='f12']")
	WebElement homebtn;
	
	public WebElement Email()
	{
		return email;
	}
	
	public WebElement Pass()
	{
		return pass;
	}
	
	public WebElement Go()
	{
		return go;
	}
	
	public WebElement Home()
	{
		return homebtn;
	}
}

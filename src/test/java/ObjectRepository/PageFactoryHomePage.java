package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryHomePage {

	WebDriver driver;
	public PageFactoryHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement search;
	
	@FindBy(xpath="//div[@id = 'topsrchhome']/form/input")
	WebElement searchbtn;
	
	public WebElement SearchBox()
	{
		return search;
	}
	
	public WebElement SearchButton()
	{
		return searchbtn;
	}

}

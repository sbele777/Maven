package TestMavenCheck.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass{

	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToKartButton;
	
	@FindBy(xpath="//span[@class='B_NuCI']")
	private WebElement productName;
	
	public ProductPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddtoKart()
	{
		addToKartButton.click();
	}
	
	public WebElement getProductName()
	{
		return productName;
	}
	
	public WebElement buttonAddToKart()
	{
		return addToKartButton;
	}
	
	
	
	
}

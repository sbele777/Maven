package TestMavenCheck.Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	
	@FindBy(xpath="//title[text()='Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!']")
	private WebElement title;
	
	@FindBy(xpath="//div[text()='shivam']")
	private WebElement loginName;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchBar;
	
	@FindBy(xpath="//div[@class='col col-7-12']//div[text()='APPLE iPhone 13 Pro Max (Alpine Green, 512 GB)']")
	private WebElement phone;
	
	@FindBy(xpath="//div[text()='Top Offers']")
	private WebElement topOffers;
	
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement cartIcon;
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleofHomePage()
	{
		String title1 = driver.getTitle();
		System.out.println(title1);
		return title1;
	}
	
	public String getLoginAccountName()
	{
		String name = loginName.getText();
		System.out.println(name);
		return name;
	}
	
	public void search(String srch)
	{
		searchBar.sendKeys(srch);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public WebElement checkPhone()
	{
		return phone;
	}
	
	public WebElement searchBar()
	{
		return searchBar;
	}
	
	public WebElement topOffers()
	{
		return topOffers;
	}
	
	public void clickCartIcon()
	{
		cartIcon.click();
	}
}

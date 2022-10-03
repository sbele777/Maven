package TestMavenCheck.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {

	@FindBy(xpath="//a[@class='_2Kn22P gBNbID']")
	private WebElement item;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeOrderButton;
	
	public CartPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement itemInCart()
	{
		return item;
	}
	
	
	public WebElement buttonPlaceOrder()
	{
		return placeOrderButton;
	}
	
	public void print()
	{
		System.out.println();
	}
	
}

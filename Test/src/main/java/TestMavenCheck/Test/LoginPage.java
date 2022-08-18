package TestMavenCheck.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement emaiID;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='_2YsvKq o8qAfl']")
	private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void putEmail(String email)
	{
		emaiID.sendKeys(email);
	}
	
	public void putPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);
	}
	/*
	public void loginMethod(String usernameData, String passwordData) throws InterruptedException {
		emaiID.sendKeys(usernameData);
		password.sendKeys(passwordData);
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);
	}
	*/
	
	
}

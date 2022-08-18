package TestMavenCheck.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HomePageTest extends BaseTest{

	@Test
	public void varifySearchItem() throws InterruptedException  
	{
		login.putEmail("shivambelekar1996@gmail.com");
		login.putPassword("sbele777");
		login.clickLoginButton();
		
		Thread.sleep(5000);
		
		homepage.search("iphone 13 pro max");
		
		Thread.sleep(5000);
		WebElement w = homepage.checkPhone();
		Thread.sleep(5000);
		
		Assert.assertEquals(w.isDisplayed(), true);
			
	}
	
	
	
	
	
	
}

package TestMavenCheck.Test;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {

	
	@Test
	public void varifyAddtoKart() throws InterruptedException
	{
		
		login.putEmail("shivambelekar1996@gmail.com");
		login.putPassword("sbele777");
		login.clickLoginButton();
		
		Thread.sleep(5000);
		WebElement sw = homepage.searchBar();
		homepage.search("iphone 13 pro max");
		
		Thread.sleep(5000);
		WebElement w = homepage.checkPhone();
		w.click();
		
		Thread.sleep(5000);
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Assert.assertEquals(productpage.buttonAddToKart().isEnabled(), true);
		productpage.clickOnAddtoKart();
		Thread.sleep(5000);
	}
	
	
	
}

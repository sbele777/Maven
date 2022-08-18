package TestMavenCheck.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginPageTest extends BaseTest {

	@Test
	public void varifyLogin() throws InterruptedException
	{
		
		login.putEmail("shivambelekar1996@gmail.com");
		
		login.putPassword("sbele777");
		login.clickLoginButton();
		
		Thread.sleep(7000);
		String expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(homepage.getTitleofHomePage(), expected);
		
		String name = "shivam";
		Assert.assertEquals(homepage.getLoginAccountName(), name);
		
	}
	
	@Test
	public void varifyTopOffers() throws InterruptedException
	{
		
		Assert.assertEquals(homepage.topOffers().isDisplayed(), true);
	}
}

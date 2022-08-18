package TestMavenCheck.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

	
	@Test
	public void varifyItemInCart() throws InterruptedException
	{
		login.putEmail("shivambelekar1996@gmail.com");
		login.putPassword("sbele777");
		login.clickLoginButton();
		
		Thread.sleep(5000);
		homepage.clickCartIcon();
		Thread.sleep(5000);
		String name = cartpage.itemInCart().getText();
		Assert.assertEquals(name, "APPLE iPhone 13 Pro Max (Alpine Green, 512 GB)");
	}
	
	@Test
	public void varifyPlaceOrderBtnEnabled()
	{
		Assert.assertEquals(cartpage.buttonPlaceOrder().isEnabled(), true);
	}
}

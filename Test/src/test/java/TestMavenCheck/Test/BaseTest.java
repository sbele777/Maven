package TestMavenCheck.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import extentReportListenerUtil.CustomReport;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest extends BaseClass{

	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
	}
	
	@BeforeMethod
	public void pageObjects()
	{
		login = new LoginPage(driver);
		homepage = new HomePage(driver);
		productpage = new ProductPage(driver);
		cartpage = new CartPage(driver);
	}
	
	@AfterClass
	public void tearDownBrowser() {
		driver.quit();
	}
}

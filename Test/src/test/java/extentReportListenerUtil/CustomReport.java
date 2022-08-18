package extentReportListenerUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReport {

	public static ExtentReports extents;
	//public ExtentReports extent = CustomReport.extentReportGenerator();
	//public ExtentTest test;
	public static ExtentReports extentReportGenerator() {
		String path = System.getProperty("user.dir") + "\\reports\\FlipKartTesting.html";
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(path);
		extentHtmlReporter.config().setReportName("FlipKart Testing");
		extentHtmlReporter.config().setDocumentTitle("FlipKart Extent Report");
		//extentHtmlReporter.config().setTheme(Theme.DARK);
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
		extentHtmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy,hh:mm a '('zzz')' ");
	
		
		extents = new ExtentReports();
		extents.setSystemInfo("OS", "Windows");
		extents.setSystemInfo("Browser", "Chrome");
		extents.setSystemInfo("ProjectIGI", "Trial 911");
		extents.attachReporter(extentHtmlReporter);
		
		return extents;
	}
}

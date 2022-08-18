package extentReportListenerUtil;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import TestMavenCheck.Test.BaseTest;



public class Listenerr extends BaseTest implements ITestListener {
	
	ExtentReports extent = CustomReport.extentReportGenerator();
	ExtentTest test;

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO,"Test Started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Passed");
		
		
	}

	public void onTestFailure(ITestResult result) {  
        // TODO Auto-generated method stub  
		test.log(Status.FAIL, "Failed"); 
    }  
	public void onTestSkipped(ITestResult result) {  
        // TODO Auto-generated method stub  
        test.log(Status.SKIP,"Skipped");  
    }  
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}

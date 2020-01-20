package DriverOptions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {
public	ExtentHtmlReporter Report;
public	ExtentReports extent;
	@BeforeSuite
	public void ReportSetup() {
		 Report=new ExtentHtmlReporter("extent.html");
	     extent=new ExtentReports();
		
		extent.attachReporter(Report);
	}
	
	
	@AfterSuite
	public void ReportDone() {
		extent.flush();
	}
}



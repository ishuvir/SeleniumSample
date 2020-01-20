package DriverOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverFunctions extends ExtentReporting{
	
	public WebDriver driver;
	@BeforeMethod
	public void Initialize() {
    System.setProperty("webdriver.chrome.driver", "D:\\lib\\libs\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	}

	@AfterMethod
	public void Close() {
	driver.close();
	}
	
	public void nuuu() {
		System.out.println("New india");
	}
	
}



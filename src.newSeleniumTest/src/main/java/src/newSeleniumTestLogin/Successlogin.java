package src.newSeleniumTestLogin;

//import DriverOptions.DriverFunctions;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import PageObjectlocator.PageobjectLocator;


public class Successlogin  extends PageobjectLocator {

	
	@Test
	public void LoginAmazon() throws InterruptedException
	{
	driver.get("https://www.amazon.nl");
    String title=driver.getTitle();
    Reporter.log("Title value is displayed");
    System.out.println("Title of screen =" +title);
    DriverPerform("id",Accountlink).click();;
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    DriverPerform("name",UsernameField).sendKeys("singh.ivsingh@gmail.com");;
    DriverPerform("id",continuebutton).click();
    DriverPerform("name",passfield).sendKeys("*******");
    DriverPerform("id",submitb).click();
    Thread.sleep(2000);
    
    try {
    	WebElement Text=DriverPerform("xpath",passError);
  Boolean errorText=Text.isDisplayed();
    	System.out.println("Error Exist="+errorText);
    	String TextReason=Text.getText();
    	System.out.println(TextReason);
    Reporter.log("Error message is displayed");
    }
    catch(Exception e) 
    {
    	e.printStackTrace();
    }
	}

}

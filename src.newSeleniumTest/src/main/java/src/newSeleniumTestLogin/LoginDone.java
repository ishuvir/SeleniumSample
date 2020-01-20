package src.newSeleniumTestLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageObjectlocator.PageobjectLocator;

public class LoginDone extends PageobjectLocator {

	
	@Test
	public void LoginAmazon() throws InterruptedException
	{
	driver.get("https://www.amazon.nl");
	ExtentTest t=extent.createTest("Login Test","Hope will work");
    String title=driver.getTitle();
 //   Reporter.log("Title value is displayed");
    t.log(Status.INFO, "First Test Run");
    System.out.println("Title of screen =" +title);
    DriverPerform("id",Accountlink).click();
    t.log(Status.PASS, "Clicked on link");
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    DriverPerform("name",UsernameField).sendKeys("singh.ivsingh@gmail.com");;
    DriverPerform("id",continuebutton).click();
    t.log(Status.PASS, "Clicked on link");
    DriverPerform("name",passfield).sendKeys("Honeyk@1621");
    t.log(Status.PASS, "Clicked on link");
    DriverPerform("id",submitb).click();
    t.log(Status.PASS, "Clicked on link");
    Thread.sleep(2000);
  Boolean discond=  DriverPerform("xpath",searchbar).isDisplayed();
  System.out.println(discond);
     if (DriverPerform("xpath",searchbar).isDisplayed()) {
    	Reporter.log("Login Successful"); 
    		
     }
     else {
    	 
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
     Reporter.log("Entering Product in Search bar to buy");
     t.log(Status.PASS, "Clicked on link");
     WebElement search= DriverPerform("xpath",searchbar);
     String searchItem="Harry Potter";
     		search.sendKeys(searchItem);
     		search.submit();
     		Thread.sleep(3000);
    String headText=DriverPerform("xpath",searchhead).getText();
    System.out.println(headText);
    Thread.sleep(3000);
    String[] HeadNewS=headText.split("voor");
    System.out.println(HeadNewS[1]);
    if(HeadNewS[1].contains(searchItem)) {
    	System.out.println("Correct Search Results are displayed");
    }
    else {
    	System.out.println("No Search Result Match ");
    }
    t.log(Status.INFO, "First Test Done");
	}


}

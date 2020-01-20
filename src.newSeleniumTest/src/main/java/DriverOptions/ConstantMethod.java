package DriverOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConstantMethod extends DriverFunctions{
	
	public WebElement DriverPerform(String inspection ,String value) {
		WebElement ele = null;
	String objectV=value;
	String locator=inspection;
if(locator=="xpath") {
   ele =driver.findElement(By.xpath(objectV));
 
}
else if(locator=="id") {
ele =driver.findElement(By.id(objectV));
	  
	}
else if(locator=="name") {
	  ele =driver.findElement(By.name(objectV));
	 
	}
else if(locator=="className") {
	 ele =driver.findElement(By.className(objectV));
	  
}

else {
	System.out.println("Object not found");

	}
return ele;

	}
}

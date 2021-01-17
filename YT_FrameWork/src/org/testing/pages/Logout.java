package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	ChromeDriver driver;  
	Properties pr; 
	
	public Logout (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void logout () 
	{
		WebElement Click=driver.findElementByXPath(pr.getProperty("Avi"));
		Click.click();		
		WebElement Signout=driver.findElementByXPath(pr.getProperty("Signout"));
	    Signout.click();
	}
	
}

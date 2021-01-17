package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC_4 extends Base {
	
	@Test
	public void login() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		WebElement Sign=driver.findElement(By.xpath(pr.getProperty("Login")));
		Sign.click();
		WebElement Email=driver.findElement(By.xpath(pr.getProperty("UserName")));
		Email.sendKeys("Avit90980@gmail.com");		
		WebElement Next=driver.findElement(By.xpath(pr.getProperty("Nextbutton")));
		Next.click();
		Thread.sleep(3000);
		WebElement Pass=driver.findElement(By.xpath(pr.getProperty("Password")));
		Pass.sendKeys("Avit@123456");
		WebElement Next1=driver.findElement(By.xpath(pr.getProperty("Nextbutton")));
		Next1.click();
		
		WebElement Play=driver.findElement(By.id(pr.getProperty("PlayVideo")));
	    Play.click();
	   
	    WebElement Click=driver.findElementByXPath(pr.getProperty("Avi"));
		Click.click();		
		WebElement Signout=driver.findElementByXPath(pr.getProperty("Signout"));
	    Signout.click();
}
}
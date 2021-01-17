package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_2 extends Base{
	
	@Test
	public void history() throws InterruptedException, IOException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		Login login = new Login (driver,pr);
		login.signin("Avit90980@gmail.com", "Avit@123456");
		
		 WebElement History=driver.findElementByXPath(pr.getProperty("History"));
	     History.click(); 
		 
	     ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\Awanish\\Desktop\\First1.png"); 
	     Thread.sleep(3000);
		 
		 Logout logout =new Logout(driver,pr);
		 logout.logout();
	
}
}
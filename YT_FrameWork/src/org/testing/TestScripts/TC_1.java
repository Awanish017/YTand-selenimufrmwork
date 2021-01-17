package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class TC_1 extends Base {
	@Test
	public void trending() throws InterruptedException, IOException 
	{   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		Login login = new Login (driver,pr);
		login.signin("Avit90980@gmail.com", "Avit@123456");
		
		
		WebElement Trend=driver.findElement(By.xpath(pr.getProperty("Trending")));
		Trend.click();
		Thread.sleep(3000);
		
		ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\Awanish\\Desktop\\First.png");
		
		Logout logout =new Logout(driver,pr);
		 logout.logout();
		
		
	      	}
	
	}

	

package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	  @BeforeMethod
	  public void BrowserLaunch() throws InterruptedException 
	  {
		  System.setProperty("webDriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\chromedriver.exe");
		  //System.out.println(Brwoser+urlhit));
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.youtube.com/");
			Thread.sleep(3000);
		  
	  }
	  @Test
	   public void login()
	   {    System.setProperty("webDriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\chromedriver.exe");
		  //System.out.println(Brwoser+urlhit));
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.youtube.com/");
		 
		  WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		  sign.click();
		  WebElement Email= driver.findElement(By.xpath("//input[@id='identifierId']"));
			Email.sendKeys("awanish.tiwari@abbieit.com");
			WebElement next=driver.findElement(By.xpath("//span[text()='Next']")); 	
			next.click();
			WebElement pass= driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
			pass.sendKeys("Gmail@1234");
	   }
	  @AfterMethod 
	  public void close()
	  {
		  //  close the browser 
	  }
	}

package org.testing.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String []args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		// a=45;   
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		//WebElement sign=driver.findElement(By.cssSelector('yt-formatted-string:contains("Sign in")'));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		sign.click();
		WebElement Email= driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email.sendKeys("awanish.tiwari@abbieit.com");
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']")); 	
		next.click();
		WebElement pass= driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		pass.sendKeys("Gmail@1234");
		WebElement next2=driver.findElement(By.xpath("//span[text()='Next']")); 	
		next2.click();
		 WebElement Trend=driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")); 	
		Trend.click();
		 WebElement Game= driver.findElement(By.xpath("//div[text()='Gaming']"));
		 Game.click();
		 WebElement home=driver.findElement(By.xpath("//yt-formatted-string[text()='Home']"));
		 home.click();
		 WebElement play=driver.findElement(By.id("img"));
				 play.click();
	
	}
}

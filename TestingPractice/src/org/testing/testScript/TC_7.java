package org.testing.testScript;      //  Login - Video Play- Comment Post

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_7 
{
                 
	  public static void main(String []args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    WebElement Signin=driver.findElement(By.cssSelector("paper-button[aria-label='Sign in']"));
	    Signin.click();
	    WebElement Email=driver.findElement(By.cssSelector("input[aria-label='Email or phone']"));
	    Email.sendKeys("awanish.tiwari@abbieit.com");
	    WebElement Next=driver.findElement(By.cssSelector("span[class='RveJvd snByac']"));
	    Next.click();
	    WebElement Pass= driver.findElement(By.cssSelector("input[autocomplete='current-password']"));
	   //(By.xpath("//div[text()='Gaming']"))
	    Pass.sendKeys("Gmail@1234");
	    WebElement Next1=driver.findElement(By.xpath("//span[@class='CwaK9']"));
	    Next1.click();
	    WebElement Trending=driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']"));
        Trending.click();
        WebElement A=driver.findElement(By.id("img"));
        A.click();
	    WebElement Signout=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
	    Signout.click();
	    driver.close();
}
}
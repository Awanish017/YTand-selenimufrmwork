package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java1 {

	public static void main (String []args) throws InterruptedException
	
	{  
		System.setProperty("webdriver.chrome.driver", "../AutomationRMS_Project/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://test.rms.abbieit.com");
		
		driver.manage().window().maximize();
		WebElement usname= driver.findElement(By.xpath("//input[@name='userName']"));
		usname.sendKeys("awanish");
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("abbieit123");
		
		driver.findElement(By.xpath("//button[@color='primary']")).click();
		Thread.sleep(3000);
		WebElement SystemManagement = driver.findElement(By.xpath("//span[contains(text(),'System Management')]"));
		SystemManagement.click();
		WebElement UserM=driver.findElement(By.xpath("//li[@ng-reflect-router-link='/,user']"));
		UserM.click();
		Thread.sleep(5000);
		  driver.close();
		
	
		
	} 
	
}
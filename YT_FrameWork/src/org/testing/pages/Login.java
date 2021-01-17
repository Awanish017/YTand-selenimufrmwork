package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;  
	Properties pr; 
	
	public Login (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String user, String Password) throws InterruptedException
	
	{
		WebElement Sign=driver.findElement(By.xpath(pr.getProperty("Login")));
		Sign.click();
		WebElement Email=driver.findElement(By.xpath(pr.getProperty("UserName")));
		Email.sendKeys(user);
		
		
		WebElement Next=driver.findElement(By.xpath(pr.getProperty("Nextbutton")));
		Next.click();
		Thread.sleep(3000);
		WebElement Pass=driver.findElement(By.xpath(pr.getProperty("Password")));
		Pass.sendKeys(Password);
		
		WebElement Next1=driver.findElement(By.xpath(pr.getProperty("Nextbutton")));
		Next1.click();
	}

}

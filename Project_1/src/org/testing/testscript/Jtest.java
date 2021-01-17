package org.testing.testscript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jtest {
	 WebDriver driver;    //like int a;
	                      
	@Before
	public void Urlhit()
	{  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		// a=45;   
        driver=new ChromeDriver();    
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@After
	public void close()
	{
		WebElement Day=driver.findElement(By.cssSelector("select[name='birthday_day']"));
		   Select r=new Select(Day);
		   r.selectByIndex(5);
		WebElement Month= driver.findElement(By.cssSelector("select#month"));
		   Select M=new Select(Month); 
		   M.selectByVisibleText("Jul");
		WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
		   Select y= new Select(year);
		   y.selectByValue("2018");
		   WebElement submit=driver.findElement(By.cssSelector("button[name='websubmit']"));
			submit.click();
		  driver.close();
	
}
	@Test
   public void tc() 
   {
		WebElement Email=driver.findElement(By.id("email")); 
		Email.sendKeys("tiwariawanish@yahoo.com");
		WebElement Pass=driver.findElement(By.cssSelector("input[name='pass']"));
		Pass.sendKeys("1234555");
		WebElement Fname= driver.findElement(By.cssSelector("input[name='firstname']"));
		Fname.sendKeys("Ravi");
		WebElement Lname=driver.findElement(By.cssSelector("input[name='lastname']"));
		Lname.sendKeys("Kumar");
		WebElement Pwd=driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
		Pwd.sendKeys("524111");
	
   }
	}
	
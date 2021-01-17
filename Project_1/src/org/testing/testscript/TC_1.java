package org.testing.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class TC_1 {
	  
	 public static void  main (String []args) throws InterruptedException 
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Email=driver.findElement(By.id("email")); 
		Email.sendKeys("tiwariawanish@yahoo.com");
		WebElement Pass=driver.findElement(By.cssSelector("input[name='pass']"));
		Pass.sendKeys("1234555");
		
		/*WebElement login= driver.findElement(By.cssSelector("input[value='Log In']"));
		login.click();
		Thread.sleep(3000);
		WebElement Em= driver.findElement(By.cssSelector("input[name='email']"));
		Em.sendKeys("sfdkfjdkfjdkjf");
		WebElement pa=driver.findElement(By.cssSelector("input[name='pass']"));
		pa.sendKeys("77645646546");
		WebElement Lo= driver.findElement(By.cssSelector("button#loginbutton"));
		Lo.click();*/
					
		WebElement Fname= driver.findElement(By.cssSelector("input[name='firstname']"));
		Fname.sendKeys("Ravi");
		WebElement Lname=driver.findElement(By.cssSelector("input[name='lastname']"));
		Lname.sendKeys("Kumar");
		
		/* WebElement mob=driver.findElement(By.cssSelector("input[aria-describedby='js_77']"));
		mob.sendKeys("9716584906"); */ 
		
		WebElement Pwd=driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
		Pwd.sendKeys("524111");
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
		  Thread.sleep(5000);
		  driver.close();
		
		}
}

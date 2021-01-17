package org.testing.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Today {


	public static void main(String []args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		// a=45;   
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.designstring.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	
	WebElement Menu=driver.findElement(By.xpath("//a[@class='paragraph menuBtn']"));
	Menu.click();
	WebElement Life=driver.findElement(By.xpath("//span[text()='Life@DesignString']"));
	Life.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1550)");
    Thread.sleep(5000);
     WebElement body = driver.findElement(By.xpath("//span[text()='QA Engineer']"));
     body.click();
     WebElement contact=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
     contact.sendKeys("abc");
     WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
     phone.sendKeys("123456");
     WebElement Email=driver.findElement(By.xpath("//input[@placeholder='eg. johndoe@example.com']"));
     Email.sendKeys("awanishtiwari@gmail.com");
     WebElement Experience=driver.findElement(By.xpath("//input[@placeholder='eg. 2 years']"));
     Experience.sendKeys("2.5 Year");
     WebElement Current_CTC=driver.findElement(By.xpath("//input[@placeholder='eg. 4 LPA']"));
     Current_CTC.sendKeys("4.5 ");
     WebElement Expected_CTC=driver.findElement(By.xpath("//input[@placeholder='eg. 5 LPA'] "));
     Expected_CTC.sendKeys("10 ");
     WebElement Notice=driver.findElement(By.xpath("//select[@name='Notice Period']"));
     Select s=new Select (Notice);
		s.selectByIndex(2);
	 WebElement Message=driver.findElement(By.xpath("//textarea[@placeholder='Enter message']"));
	 Message.sendKeys("Hai this is me ");
     
   //input[@type='tel']
	
   
}
}
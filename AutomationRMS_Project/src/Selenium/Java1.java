package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Java1 {

	public static void main (String []args) throws InterruptedException {

	 //ChromeDriver driver; 
	
	/* @BeforeMethod
	public void Brlauch()
	{ */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://test.rms.abbieit.com");
		driver.manage().window().maximize();
		
    /*@Test
	public void TestCase() throws InterruptedException 
  {	*/
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

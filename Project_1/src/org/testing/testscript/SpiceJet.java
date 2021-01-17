package org.testing.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	
	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement currency= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s= new Select(currency);
		s.selectByValue("AED");
		s.selectByIndex(1);
		s.selectByVisibleText("USD");
		Thread.sleep(5000);
		WebElement passenger= driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passenger.click();
		WebElement adult=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		Select s1 =new Select(adult);
		s1.selectByValue("2");
		WebElement child=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select s2=new Select (child);
		s2.selectByIndex(2);
		WebElement infat=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
		Select s3=new Select (infat);
		s3.selectByIndex(2);
		WebElement from=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		from.click();
		WebElement Bho=driver.findElement(By.xpath("//a[@value='BHO']"));
		Bho.click();
		//WebElement JAI=driver.findElement(By.xpath("//a[@value='JAI']"));
		WebElement JAI=driver.findElement(By.xpath("//td[@class='mapbg' ] //a[@value='JAI']")); // Parent to child
		JAI.click();

	}

}
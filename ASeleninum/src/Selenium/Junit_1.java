package Selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junit_1 {
	ChromeDriver driver ;
	
	public static void SelectClassMethod(String IndexValue , WebElement element)
	{
	    Select s= new Select(element);
	    s.deselectByVisibleText(IndexValue);	    
	}
	@Before
	public void setproperty()
	{
		System.setProperty("webdriver.chrome.driver", "../ASeleninum/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		
		 driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void testCase() throws InterruptedException
	{
     
	 	WebElement signup= driver.findElementByXPath("//a[@id='u_0_2']");		
	signup.click();
	Thread.sleep(3000);
	WebElement firstname=driver.findElementByXPath("//input[@name='firstname']");
			 
	firstname.sendKeys("Awanish");
	WebElement surname= driver.findElementByXPath("//input[@name='lastname']");

	surname.sendKeys("Tiwari");
	WebElement mnumber= driver.findElement(By.id("u_1_g"));
	mnumber.sendKeys("8802986624");
	WebElement password=driver.findElementByXPath("//input[@data-type='password']"); 
		
	password.sendKeys("1345445");
	WebElement day= driver.findElementByXPath("//select[@id='day']");
	Junit_1.SelectClassMethod("9", day);
	
	WebElement month=driver.findElementByXPath("//select[@id='month']"); 
			
	Junit_1.SelectClassMethod("12", month);
	WebElement year=driver.findElementByXPath("//select[@id='year']");
		
	Junit_1.SelectClassMethod("1992", year);
    WebElement radio=driver.findElementByXPath("//input[@id='u_1_3']");
    	
    radio.click();
    WebElement submit=driver.findElementByXPath("//button[@name='websubmit']");
    submit.click();
    }
	
	@After
	public void browserClose()
	{
    driver.close();
	}
}

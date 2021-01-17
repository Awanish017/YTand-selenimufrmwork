package Selenium;
       //  Creating Generic method for Select class and with Xpath selector 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class2 {
	
	 ChromeDriver driver; 

	public void genericMethodOfSelect(String inexvalue, WebElement element )
	{   
			Select s= new Select(element);
		s.selectByValue(inexvalue);	
			
	}
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "../ASeleninum/chromedriver.exe");
		
    Class2 obj=new Class2();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
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
		obj.genericMethodOfSelect("9", day);
		WebElement month=driver.findElementByXPath("//select[@id='month']"); 
				
		obj.genericMethodOfSelect("12", month);
		WebElement year=driver.findElementByXPath("//select[@id='year']");
			
		obj.genericMethodOfSelect("1992", year);
        WebElement radio=driver.findElement(By.id("u_1_3"));
        radio.click();
        WebElement submit=driver.findElementByXPath("//button[@name='websubmit']");
        submit.click();
        driver.close();
	}
		
		
	}



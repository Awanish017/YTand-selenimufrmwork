package org.testing.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.pages.Menu;
import org.testing.utilities.Datafile;
import org.testing.utilities.Screenshot;
import org.testing.utilities.Selectclass;
import org.testing.utilities.Waits;
import org.testng.annotations.Test;
import org.testing.base.Base; 

public class TC1 extends Base
{
	@Test
	
public void QAopening() throws InterruptedException, IOException
	
	{
		
		try
		{
			Menu m=new Menu(driver,pr);
		    m.Menuclick();

		    
		WebElement QAEngg= driver.findElement(By.xpath(pr.getProperty("QAEngg")));
		QAEngg.click();
		
		
		WebElement Contactname=driver.findElement(By.xpath(pr.getProperty("Contactname")));
		Contactname.sendKeys(Datafile.dataread(0, 2));
		
		WebElement Contactnumber=driver.findElement(By.xpath(pr.getProperty("Contactnumber")));
		Contactnumber.sendKeys(Datafile.dataread(1, 2));
		
		WebElement ContactEmail=driver.findElement(By.xpath(pr.getProperty("ContactEmail")));
		ContactEmail.sendKeys(Datafile.dataread(2,2));
		
		WebElement Totalexp=driver.findElement(By.xpath(pr.getProperty("Totalexp")));
		Totalexp.sendKeys(Datafile.dataread(2, 4));
		
		
		
		WebElement CurrentCTC= driver.findElement(By.xpath(pr.getProperty("CurrentCTC")));
		CurrentCTC.sendKeys(Datafile.dataread(2, 5));
		
		
		WebElement ExpectedCTC=driver.findElement(By.xpath(pr.getProperty("ExpectedCTC")));
		ExpectedCTC.sendKeys(Datafile.dataread(2, 6));
		
		
		
		WebElement NoticePeriod=driver.findElement(By.xpath(pr.getProperty("NoticePeriod")));
		Selectclass.dropdown(NoticePeriod, 1);
	    
	    WebElement Message=driver.findElement(By.xpath(pr.getProperty("Message")));
	    Message.sendKeys(Datafile.dataread(2, 7));
	    
	   /// JavascriptExecutor js=(JavascriptExecutor)driver;
		 //  js.executeScript("window.scrollBy(0,500)");
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement Resume= driver.findElement(By.xpath(pr.getProperty("Resume")));
		
		
		Resume.sendKeys(Datafile.dataread(2, 8));
		
		Screenshot.takescreenshots(driver, "C:\\Users\\Awanish\\Desktop\\Screenshot\\TC1 pass.png");
		// Logs.takelogs("TC1", "TC1 PASSESD");
	
		
	}
		 catch(Exception e)
		 {
			Screenshot.takescreenshots(driver, "C:\\Users\\Awanish\\Desktop\\Screenshot\\TC1 failed.png"); 
			//Logs.takelogs("TC1", "TC1 failed");	
	

}
	}

}
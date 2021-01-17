package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.Scrollclass;
import org.testing.utilities.Waits;

public class Menu {
	public ChromeDriver driver;
	public Properties pr;
	
	

	public Menu(ChromeDriver driver, Properties pr) {

		this.driver=driver;
		this.pr=pr;
	}

	public void Menuclick() throws InterruptedException {
		
		WebElement Menu= driver.findElementByXPath(pr.getProperty("Menu"));
		Menu.click();
		
		WebElement lifeatdesignstring=driver.findElementByXPath(pr.getProperty("Life"));
		lifeatdesignstring.click();
		

		//Scrollclass.scroll(driver, 0, 2550);
	  
		 Waits.implicitwait(driver, 30);
		    
			
		
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1550)");

}
}
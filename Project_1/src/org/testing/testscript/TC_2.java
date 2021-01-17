package org.testing.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_2 {
	
	public void dropdownselection(WebElement drop, int index)
	{
		Select s= new Select(drop);
		s.selectByIndex(index);
	}
   public static void  main(String[]args)
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		// a=45;   
       WebDriver driver=new ChromeDriver();    
       TC_2 obj=new TC_2();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement day= driver.findElement(By.cssSelector("select[title='Day']"));
		obj.dropdownselection(day, 5);
		WebElement Month= driver.findElement(By.cssSelector("select#month"));
		 obj.dropdownselection(Month, 5);  
		WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
		   obj.dropdownselection(year, 1990);
		   WebElement submit=driver.findElement(By.cssSelector("button[name='websubmit']"));
			submit.click();
		
		
   }
}

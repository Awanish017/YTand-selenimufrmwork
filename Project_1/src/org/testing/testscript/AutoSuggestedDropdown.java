package org.testing.testscript;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdown                                     //  Make My Trip.com
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Project_1/chromedriver2.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 driver.wait(3000);
		 WebElement from=driver.findElement(By.cssSelector("input[placeholder='From']"));
		 from.click();
		 
	}

}

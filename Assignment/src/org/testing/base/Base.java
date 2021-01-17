package org.testing.base;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	 public ChromeDriver driver;
	 public Properties pr;
	 
	 @BeforeTest
	 
	 public void BrowserLaunch() throws IOException
	 {
		 File f=new File("../Assignment/or.properties");
		 FileInputStream fi=new FileInputStream(f);
		 pr=new Properties();
		 pr.load(fi);
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Awanish\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("disable-notifications");
		  driver=new ChromeDriver();
		  driver.get("https://www.designstring.com/");
		  driver.manage().window().maximize();
	 }
@AfterTest
	  public void browserclose()
	  {
		  driver.quit();
	  }
	  
}

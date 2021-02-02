package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
		
		public ChromeDriver driver; 
		public  Properties pr; 
		
		@BeforeMethod
		public void Brlaunch() throws IOException 
		{
			File f= new File("../YT_FrameWork/Objects.properties");
			FileInputStream fi= new FileInputStream(f);
			pr= new Properties ();
			pr.load(fi);
			
		System.setProperty("webdriver.chrome.driver", "../YT_FrameWork/chromedriver2.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		}
				@AfterMethod
	    public void Browserclose() 
		{
	    	   driver.close();
    }
	    
}
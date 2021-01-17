package org.testing.utilities;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollclass {
	
	public static void scroll(ChromeDriver driver, int x, int y)
	{
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy",x,y);
}
}
package org.testing.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {
	 @BeforeMethod
	  public void BrowserLaunch() 
	  {
		  
		  //System.out.println(Brwoser+urlhit));
	  }
	  @Test
	   public void login()
	   {
		   //login+ Video play Using Collection + like
	   }
	  @AfterMethod 
	  public void close()
	  {
		  //  close the browser 
	  }

}

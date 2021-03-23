package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "../ASeleninum/chromedriver2.exe");
	
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 //driver.manage().window().maximize();
		WebElement signup=   driver.findElement(By.id("u_0_2"));
		signup.click();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("firstname")); 
		firstname.sendKeys("Awanish");
		WebElement surname= driver.findElement(By.name("lastname"));
		surname.sendKeys("Tiwari");
		WebElement mnumber= driver.findElement(By.id("u_1_g"));
		mnumber.sendKeys("8802986624");
		WebElement password= driver.findElement(By.cssSelector("input[data-type='password']"));
		password.sendKeys("1345445");
		WebElement day= driver.findElement(By.cssSelector("select[id='day']"));
		Select s= new Select(day); 
		s.selectByValue("9");
		WebElement month= driver.findElement(By.cssSelector("select#month"));
		Select s1= new Select(month);
		s1.selectByVisibleText("Dec");
		WebElement year= driver.findElement(By.cssSelector("select#year"));
		Select s2= new Select(year);
        s2.selectByIndex(28);
        WebElement radio=driver.findElement(By.id("u_1_5"));
        radio.click();
        WebElement submit=driver.findElement(By.cssSelector("button[name='websubmit']"));
        submit.click();
        driver.close();
	}

}

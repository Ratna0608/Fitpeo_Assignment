package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



/*
 * 
 * This is Base Class Page which extends by TestFitpeoPage
 * This class contains of Test methods of before and After Executing the @Test Methods
 * In this methods We have setup the Chrome Browser
 * Useful for reusability and Maintainability of the code
 * 
 * 
 * */
public class BaseClass {
	
	
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
	
	@AfterClass
	public void tearDown() {
	  driver.close();
	}

}

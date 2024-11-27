package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/*
 * 
 * This is a Base Page Class which extend the Fitetpeo Home page and Revenue Calculator Page
 * In this I have intialized the WebDriver and pageFactory
 * This is created for reusability
 * 
 * */

public class BasePage {
	
	
	public WebDriver driver ;
	public JavascriptExecutor js;
	public Actions act;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}


}

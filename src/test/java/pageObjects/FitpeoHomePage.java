package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*
 * 
 * This is a Fitpeo Home Page class;
 * In this I am Intialized the Home page related locators and methods
 * To navigate to Revenue Calculator Page
 * 
 * 
 * */

public class FitpeoHomePage extends BasePage {

	public FitpeoHomePage(WebDriver driver) {
		super(driver);
	}
	//locators
	@FindBy(xpath="//*[text()='Revenue Calculator']")
	WebElement revenueCalculatorlink;
	
	//actions
	public void revenueCalculator_Click() {
		revenueCalculatorlink.click();

	}
	
}

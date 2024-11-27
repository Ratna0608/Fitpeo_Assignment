package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FitpeoHomePage extends BasePage {

	public FitpeoHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Revenue Calculator']")
	WebElement revenueCalculatorlink;
	
	
	public void revenueCalculator_Click() {
		revenueCalculatorlink.click();

	}
	
}

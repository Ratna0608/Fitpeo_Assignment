package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


/*
 * 
 * This is Revenue Calculator Page
 * In this I have Intialized Revenue calculator page related locator and methods(or)Actions
 * 
 *
 * */


public class RevenueCalculatorPage extends BasePage {
	//js=(JavascriptExecutor)driver;


	public RevenueCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	int TotalRecurringReimbursement;
	
	//Locators
	
	@FindBy(xpath="//*[text()='Medicare Eligible Patients']")
	WebElement Scrolling;
	
	@FindBy(xpath="//input[@id=':r0:']")
	WebElement txt_box;
	
	@FindBy(xpath="//input[@type='range']")
	WebElement slider;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement check_box1;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement check_box2;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	WebElement check_box3;
	
	@FindBy(xpath="(//input[@type='checkbox'])[8]")
	WebElement check_box4;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-m1khva']")
	WebElement text_TotalReimbursement;

	
	//Actions
	
	public void ScrollinToView() {
		//Scroll down the page until the revenue calculator slider is visible.

		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",Scrolling);
	}
	
	
	/*Click on the text field associated with the slider.
     *Enter the value 560 in the text field. Now the slider also should change accordingly 
     *
     */
	public void txtBoxAlongSlider(String txt_value) {
		
		act=new Actions(driver);
		  act.click(txt_box).keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.BACK_SPACE)
		   .keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).perform();
		        act.sendKeys(txt_value).perform();
		   
	
		        /*
	 * Ensure that when the value 560 is entered in the text field
	 *  the slider's position is updated to reflect the value 560
	 *  
	 *  
	 * */
		    String value= slider.getAttribute("aria-valuenow");
		    
		    
	        if(value.equals("560")) {
	        	System.out.println("Test case is passed");
	        	
	        	
	        }
	        else {
	        	System.out.println("Test case is Failed");
	        }
	}
	
	/*
	 * Performing the scrolling  and selecting the checkboxes on 
	 * CPT-99091, CPT-99453, CPT-99454, and CPT-99474.
	 * 
	 * **/
	
	public void check_boxes() {
		 //   js=(JavascriptExecutor)driver;

		   js.executeScript("arguments[0].scrollIntoView()", check_box1);
	       js.executeScript("arguments[0] .click()",check_box1);
	       js.executeScript("arguments[0].scrollIntoView()", check_box2);
	       js.executeScript("arguments[0] .click()",check_box2);
	       js.executeScript("arguments[0].scrollIntoView()", check_box3);
	       js.executeScript("arguments[0] .click()",check_box3);
	       js.executeScript("arguments[0].scrollIntoView()", check_box4);
	       js.executeScript("arguments[0] .click()",check_box4);
	       
	       
	       
		
	}
	
	
	/*
	 * Handling the slider that reaches at 820
	 * 
	 * */
	
	public void setSliderAt820() {
		//act=new Actions(driver);
		  act.click(txt_box).keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.BACK_SPACE)
		   .keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).perform();
		        act.sendKeys("820").perform();
		   

	}
	
	
	
	/* 
	 * Validate Total Recurring Reimbursement:
	 * 
	 */
	
	public void validate_RecurringReibusment() {
	    js.executeScript("arguments[0].scrollIntoView()", text_TotalReimbursement);
	    String txt=text_TotalReimbursement.getText().trim();
	    String   TotalReimbursement=  txt.substring(txt.indexOf('$')+1, txt.length());
	 	TotalRecurringReimbursement=Integer.parseInt(TotalReimbursement);
 
	     System.out.println("Total Recurring Reimbursement for all Patients Per Month :"+"$"+TotalRecurringReimbursement);

	}
	
	
	/*
	 *Verifying the header displaying Total Recurring Reimbursement for all Patients Per Month: 
	 *shows the value $110700 
	 *
	 * */
	
	public void Verify_RecurringReibursment(int Money) {
	   //  System.out.println("TRR="+TotalRecurringReimbursement);
	
		Assert.assertEquals(TotalRecurringReimbursement, Money);
		System.out.println(" Test case Passed: The header displays the correct value of Total Recurring Reimbursement for all Patients Per Month ");
		
		

		
	}
	
	
	
	
	
	

}

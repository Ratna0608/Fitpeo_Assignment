package testCases;

import org.testng.annotations.Test;

import pageObjects.FitpeoHomePage;
import pageObjects.RevenueCalculatorPage;
import testBase.BaseClass;


/*
 * 
 * This is a TestFitpeo Page
 * in this class we will run the test cases using Testng Frame work;
 * 
 * */


public class TestFitpeoPage extends BaseClass {
	
	@Test
	public void verifyFitpeoPage() {
	try {
	FitpeoHomePage fp=new FitpeoHomePage(driver);
	fp.revenueCalculator_Click();
	RevenueCalculatorPage rcp=new RevenueCalculatorPage(driver);
	rcp.ScrollinToView();
	rcp.txtBoxAlongSlider("560");
	rcp.check_boxes();
	rcp.setSliderAt820();
	rcp.validate_RecurringReibusment();
	rcp.Verify_RecurringReibursment(110700);
	}
	catch(Exception e){
	    System.out.println(e.toString());


		
	}
	
	}

}

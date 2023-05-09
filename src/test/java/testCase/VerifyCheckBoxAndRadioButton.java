package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

import pages.HomePage;

public class VerifyCheckBoxAndRadioButton {
	
	
	WebDriver driver;
	HomePage homePage;//ya pain homepage ko initialize karna padega
	                  //test case main homePage ka object bana diya
	
	@BeforeMethod(alwaysRun = true)
	
	public void setup() throws IOException {
		
		driver=Utility.getDriver();//  Utility.getDriver(); this method is from Utility
		driver.get(Utility.getProperty("url"));//getProperty this is from Utility
		driver.manage().window().maximize();
		homePage=new HomePage(driver);//homepage ka object banan padega constructor webdriver 
		                              //leta hai isliye hamne driver pass kiya
		
			}

	@Test(priority=1,groups= {"e2e"},enabled = true)
	public void VerifyCheckBoxAndRadioButtonBehaviours() {
		//verify that male and female radio button are unchecked
		//make sure orange checkbox is checked and bkue checkbox is unchecked
		assertFalse(homePage.getMaleRadioButton().isSelected());//yaha pain unexpected behaviour mil raha hai
		assertFalse(homePage.getFemaleRadioButton().isSelected());
		
		//for checkbox
		assertTrue(homePage.getOrangeCheckBox().isSelected());
		assertFalse(homePage.getBlueCheckBox().isSelected());
	}                                                          

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) throws IOException {
		
		if(result.getStatus()==result.FAILURE)
    {
      Utility.getScreenShot(driver, result.getName());
     }
		 driver.quit();
	 }

}

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

public class VerifyOmayoBlogHomePage {
	
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

	@Test(priority=1,groups= {"e2e"}, enabled = true)
	public void verifyOmayoHomePage() {
		//verify user is on Omayo home page
		homePage.getPageTitle();  //getPageTitle() hi method apn HomePAge.java madhye declare keli 
		                          //ya method madhye webelemnt ghet ahot ethe call krato ahe
		                          //homaPege reference variable ni
		
	assertEquals(homePage.getPageTitle().getText(), "omayo (QAFox.com)");
	
	
	//verify that value is selected from DropDown
	String value="doc 1";// here we want  doc 1 from dorpdown which is expected so we store 
	                     //this in value and the verify with actual one
	Utility.selectVlueFromDropDown(homePage.getDropdown(), value);//this method from utility class
	                                                         //selectVlueFromDropDown()
	assertEquals(homePage.getValueSelectedInDropDown(), value);//getValueSelectedInDropDown()
	                                                           //this method from HomePage
	//verify that make sure image is at left upper side
	    assertTrue(homePage.getPersonImageAtLeftUpperSide().isDisplayed());
	    
	    //verify that multiple content in table
	    //Arrays nam ke aek class hai asLisr() ek method hai uske andar direct element dalo ge do
	    //list create karke dreta hai
	   
	    
	    List<String> expectedTableData= new ArrayList<String>();
	    expectedTableData=  Arrays.asList("Kishore","22","Delhi","Manish","25","Pune","Praveen","29",
	    		"Bangalore","Dheepthi","31","Mumbai");
//   assertEquals(homePage.getTableData(), expectedTableData);
 assertTrue(homePage.getTableData().equals(expectedTableData));
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

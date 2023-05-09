package testCase;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

import pages.HomePage;

public class IfTestFailureThenScreenShot {
	
	
	WebDriver driver;
	HomePage homePage;//ya pain homepage ko initialize karna padega
	                  //test case main homePage ka object bana diya
	
	@BeforeMethod
	
	public void setup() throws IOException {
		
		driver=Utility.getDriver();//  Utility.getDriver(); this method is from Utility
		driver.get(Utility.getProperty("url"));//getProperty this is from Utility
		driver.manage().window().maximize();
		homePage=new HomePage(driver);//homepage ka object banan padega constructor webdriver 
		                              //leta hai isliye hamne driver pass kiya
		
			}

	@Test(priority=1,groups= {"sanity"})
	public void verifyPageTitle() throws IOException {
		
		homePage.getPageTitle();  //getPageTitle() hi method apn HomePAge.java madhye declare keli 
		                          //ya method madhye webelemnt ghet ahot ethe call krato ahe
		                          //homaPege reference variable ni
	assertEquals(homePage.getPageTitle().getText(), "omayo QAFox.com");//here i am doing
	                                                     //intensionally test case fail kari hu
	                                                     //to screen shot lega
	
	}
	//yaha ka screenshot lena hai agar test case fail hua to hi screenshot le esa hamara cond hai
	@AfterMethod
	 public void tearDown(ITestResult result) throws IOException  //ITestResult ia an interface which is used for
	                                      //jo current test execute ho rahe hai uska statics stoere krna       
	{
		if(result.getStatus()==result.FAILURE)//agar result ka current status == result ka failure 
			                                 //hai to screenshot lo result main hamara current test
			                                //case ka statics store hai to woh cheeck karega
		{
			Utility.getScreenShot(driver, result.getName());//getName() hamre testcase ke nam se 
			                                                //image show hogi   
		}
		 driver.quit();
	 }

}

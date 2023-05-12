package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;


public class VerifyApplicationHomePageTitle {
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

	@Test(priority=1,groups= {"sanity"})
	public void verifyPageTitle() {
		
		homePage.getPageTitle();  //getPageTitle() hi method apn HomePAge.java madhye declare keli 
		                          //ya method madhye webelemnt ghet ahot ethe call krato ahe
		                          //homaPege reference variable ni
	assertEquals(homePage.getPageTitle().getText(), "omayo (QAFox.com)");
	}
	@Test
	public void searchTextBox() {
		System.out.println(homePage.searchTextFieldEnabled());
		assertTrue(homePage.searchTextFieldEnabled());
		
	}
	@Test
	public void  textInSerachTextField() {
		
		homePage.setTextInSerachTextField("Aparna");
		
	}
	
	@AfterMethod(alwaysRun = true)
	 public void tearDown() {
		 driver.quit();
	 }
	
	

}


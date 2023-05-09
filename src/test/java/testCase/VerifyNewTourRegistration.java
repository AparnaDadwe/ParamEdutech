package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

import pages.NewToursHomePage;
import pages.RegistrationPage;

public class VerifyNewTourRegistration {
	
	WebDriver driver;
	NewToursHomePage newTourshomePage;//ya pain homepage ko initialize karna padega
	                  //test case main homePage ka object bana diya
	RegistrationPage registrationPage;
	
	@BeforeMethod
	
	public void setup() throws IOException {
		
		driver=Utility.getDriver();//  Utility.getDriver(); this method is from Utility
		driver.get(Utility.getProperty("url"));//getProperty this is from Utility
		driver.manage().window().maximize();
		newTourshomePage=new NewToursHomePage(driver);//homepage ka object banan padega constructor webdriver 
		                              //leta hai isliye hamne driver pass kiya
		registrationPage=new RegistrationPage(driver);
			}
	@Test(dataProvider="registration")
	public void verifyRegistrationLink(String firstName,String lastName,String phone,String email) {
		
		newTourshomePage.clickOnRegistrationLink();
		registrationPage.getFirstNameTextField().sendKeys(firstName);
		registrationPage.getLasttNameTextField().sendKeys(lastName);
		registrationPage.getPhoneTextField().sendKeys(phone);
		registrationPage.getEmailTextField().sendKeys(email);
	}
	@DataProvider(name = "registration")
	public String[][] registrationDataProvider() {
		 
		String[][] registrationArray= {{"Sachin","Tendulkar","7894561231","appu88262@gmail.com"}};
		
		return registrationArray;
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	

}

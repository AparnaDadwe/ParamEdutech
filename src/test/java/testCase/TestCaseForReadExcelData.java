package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

import pages.HomePage;
import pages.NewToursHomePage;
import pages.RegistrationPage;

public class TestCaseForReadExcelData {
	

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
	public String[][] registrationDataProvider() throws IOException {
		 //ab yeh data excel se read karna hai 
		List<String> data=Utility.readExcelFile();// excel se data yaha aagaya 
		//Now we not fill array we make array and uska object banana padega
		String[][] registrationArray = new String[1][4];
		for(int i=0;i<data.size();i++) {
			
			registrationArray[0][i]=data.get(i);
		
		}
		return registrationArray;
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	


}

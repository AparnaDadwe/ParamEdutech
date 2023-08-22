package testCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

import pages.HomePage;

public class VerifyMultiselectDropDownFuntionality {
	WebDriver driver;
	HomePage homePage;;
	@BeforeMethod
	public void setUp() throws IOException {
		driver=Utility.getDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		homePage=new HomePage(driver);
	}
	@Test
	public void VerifyMultiselectDropDown() {
		String[] options= {"Audi","Volvo"};
		
		ArrayList<String> actualSelectedOptions=Utility.selecOptionsFromMultiDropDown(homePage.getMultiSelectDropDownLocator(), options);
	    assertEquals(actualSelectedOptions, Arrays.asList("Volvo","Audi"));
	}
	
	

}

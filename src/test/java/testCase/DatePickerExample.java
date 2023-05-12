package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.param.b5.utility.Utility;

public class DatePickerExample {
	WebDriver driver;
	@Test
	public void setUp() {
		
		driver=Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Utility.selectDateFromDatePicker(driver, "June", "2023", "15");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

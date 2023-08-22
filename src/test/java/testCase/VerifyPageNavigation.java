package testCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.param.b5.utility.Utility;
import pages.HomePage;
import pages.Selenium143page;

public class VerifyPageNavigation {
	WebDriver driver;
	HomePage homePage;
	Selenium143page selenium143Page;
	@BeforeMethod
	public void setUp() throws IOException {
		driver=Utility.getDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		homePage=new HomePage(driver);
		selenium143Page=new Selenium143page(driver);
	}
	@Test
	public void verifyNavigation() {
		homePage.clickOnThisBlogCreatedLink();
	    String parentWindowHandle=Utility.switchToNewWindow(driver);//switchToNewWindow(driver) it will return ur parentWindowHandle
	    String actualText=selenium143Page.getWhatIsSeleniumText();
	    String expectedText="What is Selenium?";
	    assertEquals(actualText, expectedText);
	    //first we have to close our currentwindow that is child window then we have to switch to parent window
	    
	    driver.close();//means current window close hoga
	  Utility.switchToParentWindow(driver, parentWindowHandle);
	  assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

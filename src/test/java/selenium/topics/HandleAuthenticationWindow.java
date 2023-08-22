package selenium.topics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//https://username:password@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String actualText=	driver.findElement(By.cssSelector("p")).getText();
	System.out.println(actualText);
	String expectedText="Congratulations! You must have the proper credentials.";
			
	assertEquals(actualText, expectedText);
		

	}

}

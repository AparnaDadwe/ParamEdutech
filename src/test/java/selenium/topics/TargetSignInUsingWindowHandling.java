package selenium.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TargetSignInUsingWindowHandling {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifySignIn() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//a//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[@data-test='accountNav-signIn']")).click();
	}
	

	
}

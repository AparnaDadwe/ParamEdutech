package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferntTypesOfLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.flipkart.com/");
//		
//		WebElement nameElement=driver.findElement(By.name("q"));
//		
//		nameElement.sendKeys("Mobile");
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailElement=driver.findElement(By.id("email"));
		emailElement.sendKeys("Your Email");
		
		WebElement passwordElement=driver.findElement(By.id("pass"));
		passwordElement.sendKeys("Your password");
		
		
		
		

	}

}

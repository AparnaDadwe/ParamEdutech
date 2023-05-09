package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextWindow {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		

		driver.navigate().to("https://www.flipkart.com/"); 
		
		System.out.println(driver.getCurrentUrl()); // so that it gets url of flipkar
		Thread.sleep(3000);
		driver.navigate().back();// controll get backs to old website
		System.out.println(driver.getCurrentUrl());

	}

}

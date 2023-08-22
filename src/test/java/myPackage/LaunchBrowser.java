package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;



public class LaunchBrowser {
	
	public static void main(String args[]) {
//		//Chrome Browser
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//		ChromeDriver driver	= new ChromeDriver(); // objcet of ChromDriver class 
		
		//we can create ChromeDriver objcet using Webdriver interface because ChromeDriver
		// in implementation class of WebDriver interface
		
		WebDriver driver =new ChromeDriver(); //WebDriver variable can hold ChromeDriver object
		
	driver.get("https://www.ebay.com/"); // get method will open the given url
//		driver.navigate().to("https://www.ebay.com/");
//		
       //Edge Driver
//		System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
//		WebDriver driver =new EdgeDriver(); 
//		driver.get("https://www.ebay.com/"); 
//		
		
		System.out.print("Title of the web page is:"+ driver.getTitle());
//		System.out.println("Current Web Page URL of the web page is:"+ driver.getCurrentUrl());
//		System.out.println("Title of the web page is:"+ driver.getPageSource());
		
		
	}

}

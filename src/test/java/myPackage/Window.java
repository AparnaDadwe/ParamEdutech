package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		 driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.in/");
		 
		 driver.navigate().back(); // redirects black window

		 System.out.println(driver.getCurrentUrl());
		
		
	}

}

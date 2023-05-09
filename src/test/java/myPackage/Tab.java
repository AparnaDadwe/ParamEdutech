package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in/");
			
			 driver.navigate().back();
			 
			 System.out.println(driver.getCurrentUrl());
			 
			 
	}

}


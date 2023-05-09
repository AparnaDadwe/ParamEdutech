package selenium.topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewTab {
	
	public static void main(String args[]) {
	  
	   
	   WebDriver driver = new ChromeDriver ();
	   
	    driver.get("https://testproject.io/");  
	    
	    System.out.println(driver.getCurrentUrl());
	  
	  driver.switchTo().newWindow(WindowType.TAB).get("https://testproject.io/platform/");
	
	    System.out.println(driver.getCurrentUrl());
	  }

}


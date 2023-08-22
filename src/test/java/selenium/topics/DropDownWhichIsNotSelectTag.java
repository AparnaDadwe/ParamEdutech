package selenium.topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWhichIsNotSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=   new ChromeDriver();
	    
	    driver.get("https://www.makemytrip.com/");
	    
	    driver.manage().window().maximize();
	}

}

package selenium.topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUpWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
	String parentWindow=	driver.getWindowHandle();
	
	driver.findElement(By.linkText("Open a popup window")).click();
	
	Set<String> popupWindow=driver.getWindowHandles();
	
	for(String window:popupWindow) 
	{
		driver.switchTo().window(window);
		if(driver.getTitle().equals(""))
		{
			
		}
	}

	}

}

package selenium.topics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form"); // this will launch google chrome browser
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical down
		js.executeScript("window.scrollBy(0,1000)", "");
	   Thread.sleep(5000);
	     //vertical up
		js.executeScript("window.scrollBy(0,-500)", "");
		//This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}

}

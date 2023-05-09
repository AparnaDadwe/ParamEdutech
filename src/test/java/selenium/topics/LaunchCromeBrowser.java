package selenium.topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchCromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.crome.driver", "src/test/resources/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/"); // this will launch google chrome browser
		
		driver.manage().window().maximize();//this will maximize google chrome window
		
		//Browser navigation command
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.in/"); //this will navigate to amazon.in
		                                                 //when ur another website open
		Thread.sleep(3000);
		driver.navigate().back(); // this will press back arrow and go to the google chrome page
		
		Thread.sleep(3000);
		driver.navigate().forward(); // this will again go to amazon website
		
		Thread.sleep(3000);
		driver.navigate().refresh(); // this will refresh your page
		
		Thread.sleep(3000);
		driver.close(); //this will close ur window of google chrome

	}

}

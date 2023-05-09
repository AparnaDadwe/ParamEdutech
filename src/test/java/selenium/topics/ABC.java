package selenium.topics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
   static	WebDriver driver= new ChromeDriver();
	public static void main(String[] args) {
		driver.get("https://demoqa.com/automation-practice-form"); // this will launch google chrome browser
		driver.manage().window().maximize();
		ABC a= new ABC();
//		a.selectCheckBox("Sports", "Reading", "Music");
		a.selectFirstTwoCheckBox("Sports", "Reading");
		}
//	public void selectCheckBox(String hobbies1, String hobbies2, String hobbies3) {
//
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//	//multiple checkbox
//List<WebElement>multipleHobbies=driver.findElements(By.xpath("//input[@class='custom-control-input' and @type='checkbox']"));
//		 System.out.println("No of CheckBox is"+multipleHobbies.size());
//			for(WebElement hobbies:multipleHobbies) {
//		js.executeScript("arguments[0].click();", hobbies);
//		}
//		//First two checkbox
//		
//	}
	
public void selectFirstTwoCheckBox(String firstHobby, String SecondHobby) {
JavascriptExecutor js=(JavascriptExecutor)driver;
List<WebElement>firstTwoHobbies=driver.findElements(By.xpath("//input[@class='custom-control-input' and @type='checkbox']"));
		int totalNoOfCheckBoxes= firstTwoHobbies.size();
		 for(int i=0;i<totalNoOfCheckBoxes;i++) {
	    	   if(i<2) {
	    		  // firstTwoHobbies.get(i).click();
	    		   js.executeScript("arguments[0].click();", firstTwoHobbies.get(i));
	       }
	       }
		
	}
	
	}



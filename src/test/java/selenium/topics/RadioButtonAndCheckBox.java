package selenium.topics;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButtonAndCheckBox {
	public static void main(String[] args) throws InterruptedException {
      WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form"); // this will launch google chrome browser
		driver.manage().window().maximize();
		WebElement textareaField=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",textareaField);
		textareaField.sendKeys("104 Mahalaxmi Appartment Sangamwadi Pune");
		Thread.sleep(5000);
		textareaField.clear();
	WebElement genderFRadioButton=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
	js.executeScript("arguments[0].click();", genderFRadioButton);	
	Thread.sleep(5000);
	
	WebElement hobbiesCheckBox=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	js.executeScript("arguments[0].click();", hobbiesCheckBox);	
	
	Thread.sleep(5000);
	
	WebElement genderMRadioButton=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	js.executeScript("arguments[0].click();", genderMRadioButton);
	
	Thread.sleep(5000);
	
	WebElement hobbiesCheckBoxMusic=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
	js.executeScript("arguments[0].click();", hobbiesCheckBoxMusic);
		
	}

}

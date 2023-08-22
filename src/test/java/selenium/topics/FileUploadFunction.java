package selenium.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadFunction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	WebElement fileUploadBtn=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	fileUploadBtn.sendKeys("D:\\Eclipse Workspace\\com.param.b5\\src\\test\\resources\\registration.xls");

	}

}

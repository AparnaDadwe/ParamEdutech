package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium143page {
	WebDriver driver;
	
	public Selenium143page(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getWhatIsSeleniumText() {
		return driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText();
	}

}

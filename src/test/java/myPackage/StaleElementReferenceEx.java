package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
	WebElement searchTextBox=	driver.findElement(By.xpath("//input[@id='search']"));
	searchTextBox.sendKeys("Mobile");
	driver.navigate().refresh();
	try {
	searchTextBox.sendKeys("Baby Wipes");
	}
	catch(StaleElementReferenceException e)
	{
		searchTextBox=	driver.findElement(By.xpath("//input[@id='search']"));// re identifying the element 
		searchTextBox.sendKeys("Mobile");
	}
	}

}

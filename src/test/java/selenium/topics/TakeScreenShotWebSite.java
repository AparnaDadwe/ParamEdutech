package selenium.topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotWebSite {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//After launch website takescreenshot of that 
		
		//TakesScreenshot is interface in seleniun we can not make object of selenium 
		//we have to typecast with our driver
		
		TakesScreenshot  takesscreeShot=(TakesScreenshot)driver;
	   File file=	takesscreeShot.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyDirectory(file, new File("src/test/resources/screenshot/image.png"));

	}

}

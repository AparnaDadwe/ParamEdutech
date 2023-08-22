package selenium.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownSingleSelection {

	public static void main(String[] args) {
		WebDriver driver=   new ChromeDriver();
	    
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    driver.manage().window().maximize();
	    
	   WebElement singleDropDown= driver.findElement(By.xpath("//select[@id='animals']"));
	   
       Select selectDropDownValue =new Select(singleDropDown);
       // get all option 
       
            List<WebElement>  listDropDown            =     selectDropDownValue.getOptions();
            for(WebElement option:listDropDown) {
            	System.out.println(option.getText());
            }
//     System.out.println(  selectDropDownValue.isMultiple());
//       selectDropDownValue.selectByIndex(3);
//            selectDropDownValue.selectByValue("babycat");
            selectDropDownValue.selectByVisibleText("Big Baby Cat");
            		
       
                     
	}

}

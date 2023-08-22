package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	WebElement pageTitle;
	WebElement serchTextBox;
	WebElement dropdown;
	WebElement personImageAtLeftUpperSide;
	WebElement maleRadioButton;
	WebElement femaleRadioButton;
	WebElement orangeCheckBox;
	WebElement blueCheckBox;
	WebElement multiSelectDropDown;
	
	
	public HomePage(WebDriver driver) 
	{
		
		this.driver =  driver;
		
	}
     public WebElement getPageTitle() {
    	 setPageTitle();
		return pageTitle;
	}
	public void setPageTitle() {
		this.pageTitle = driver.findElement(By.xpath("//h1[@class='title']"));
	}
	
	public WebElement getSerchTextBox() 
	{
		setSerchTextBox();
		return serchTextBox;
	}
	public void setSerchTextBox() {
		this.serchTextBox = driver.findElement(By.xpath("//input[@name='q' and @title='search']"));
	}
	
	public WebElement getDropdown() {
		 setDropdown();
		return dropdown;
	}
	public void setDropdown() {
		this.dropdown =driver.findElement(By.xpath("//select[@id='drop1']"));
	}
	public WebElement getPersonImageAtLeftUpperSide() {
		setPersonImageAtLeftUpperSide();
		return personImageAtLeftUpperSide;
	}
	public void setPersonImageAtLeftUpperSide() {
		this.personImageAtLeftUpperSide = driver.findElement(By.xpath("//img[contains(@src,'college')]"));
	}
	public WebElement getMaleRadioButton() {
		setMaleRadioButton();
		return maleRadioButton;
	}
	public void setMaleRadioButton() {
		this.maleRadioButton =driver.findElement(By.xpath("//input[@id='radio1']"));
	}
	public WebElement getFemaleRadioButton() {
		setFemaleRadioButton();
		return femaleRadioButton;
	}
	public void setFemaleRadioButton() {
		this.femaleRadioButton = driver.findElement(By.xpath("//input[@id='radio2']"));
	}
	public WebElement getOrangeCheckBox() {
		setOrangeCheckBox();
		return orangeCheckBox;
	}
	public void setOrangeCheckBox() {
		this.orangeCheckBox = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	}
	public WebElement getBlueCheckBox() {
		setBlueCheckBox();
		return blueCheckBox;
	}
	public void setBlueCheckBox() {
		this.blueCheckBox = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	}
	
	public void setTextInSerachTextField(String textToSearch) {
		getSerchTextBox().sendKeys(textToSearch);
		
	}
	//method on locator do some action on locator
	public boolean searchTextFieldEnabled() {
		
		return getSerchTextBox().isEnabled();
		
		
		}
    public	String getValueSelectedInDropDown() {
    	Select select=new Select(getDropdown());
    	return select.getFirstSelectedOption().getText();
    }
    public List<String> getTableData() {
    	//In table there afe multiple data so use collection ArrayList
    	
    	ArrayList<String> tableArray=new ArrayList<String>();
    	//esa xpath likho jo apke multiple element rreturn karke de sakata hai
    List<WebElement> tableData=	driver.findElements(By.xpath("//table[@id='table1']//tr//td"));
    for(WebElement elm:tableData) {
    	//table ke andar complete list add karega vo list chahiye to return karo List
    	tableArray.add(elm.getText());// ek ek element ka text dega lekin table ke element add kro
    }
    return tableArray;
    }
    
    public WebElement  getMultiSelectDropDownLocator() {
    	multiSelectDropDown=driver.findElement(By.id("multiselect1"));
    	return multiSelectDropDown;
    }
    public void clickOnThisBlogCreatedLink() {
    	driver.findElement(By.id("selenium143")).click();
    }
}

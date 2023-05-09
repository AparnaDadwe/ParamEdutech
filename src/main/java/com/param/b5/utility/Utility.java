package com.param.b5.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	// yeh class hamara webdriver return kareke dega

	public static WebDriver getDriver() {
		// yeh method webdriver ko initialize karake uska instance return karega
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static String getProperty(String key) throws IOException {
		// this method will read properties file key bhej do value return karega
		// in data.properties main se phir yaha ham yeh method test case main call
		// karenge
		// File class ka object banana padata hai file represent karna padta hai and
		// insert file path
		// file ko read write karne ke liye connect karna hai FileInputStream uska
		// object banao yeh file
		// leta hai
		// properties class ka object banao laod nam ka method hai yer fileinputstream
		// leta hai
		// hamko bahut sare property lene hai to usko dynamic bano String key pas karo
		File file = new File("src/test/resources/data.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key); // ya hai key ka properties milenga

	}

	public static void getScreenShot(WebDriver driver, String screenshotName) throws IOException {

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);// getScreenshotAs() yeh method File return karega
		// to file ka object banao
		FileUtils.copyFile(file, new File("src/test/resources/screenshot/" + screenshotName + ".png"));
		// file ka nam hamesh ek hi nahi rahega to usko dynami banao String
		// screenshotName
		// deke
	}

	public static List<String> readExcelFile() throws IOException {

		File file = new File("src/test/resources/registration.xls");

		FileInputStream fileInputStream = new FileInputStream(file);

		List<String> userRegistrationDetails = new ArrayList<String>();

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);

		HSSFSheet sheet = hssfWorkbook.getSheetAt(0);

		int lastRowNumber = sheet.getLastRowNum();

		int lastCellNumber = 0;

		for (int i = 1; i <= lastRowNumber; i++) {
			HSSFRow row = sheet.getRow(i);// ek ek row iterate hoga
			lastCellNumber = row.getLastCellNum(); // row ke andar cell hote hai isliye getLastCellNum() method
			for (int j = 0; j < lastCellNumber; j++) // it will iterate all cell inside the row
			{

				userRegistrationDetails.add(row.getCell(j).getStringCellValue());

			}
		}
		return userRegistrationDetails;
	}
	//method to select singlevalue from dropdown
	public static void selectVlueFromDropDown(WebElement dropDown , String valueToSelect) 
	{
		Select select=new Select(dropDown);//select yeh webelement return karta hai to dropdown 
		select.selectByVisibleText(valueToSelect);//aur value select krna hai toh valueToSelect
	}
	
	public void login()
	{}
}

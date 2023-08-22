package selenium.topics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReading {
	
	public static void main(String[] args) {
		getRowCount();
	}
	public static void getRowCount() {

		try {
			// Excell file path
			String filepath = System.getProperty("user.dir");// common line

			// getting excell file
			XSSFWorkbook wb=new XSSFWorkbook(filepath+"\\src\\test\\resources\\sampleExcel.xlsx");
			// Switching to Sheet
			XSSFSheet sheet = wb.getSheet("Sheet1");
			
			// Getting Row COunt
			int rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println("Number of rows is: " + rowCount);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

	}

}

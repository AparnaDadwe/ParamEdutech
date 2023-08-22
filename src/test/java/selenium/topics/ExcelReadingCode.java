package selenium.topics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadingCode {

	
	public static void main(String[] args) {
		ExcelReadingCode.getRowCount();

	}
	public static void getRowCount() {
      File file=new File("src/test/resources/sampleExcel.xlsx");
      try {
		FileInputStream inputStream=new FileInputStream(file);
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
		   int rows=sheet.getLastRowNum();
		   
		 //  System.out.println("Number of rows is: " + rows);
	   
	    int columns= sheet.getRow(1).getLastCellNum();
		   
  //System.out.println("Number of column is: " + columns);
	    for(int r=0;r<=rows;r++)
	    {
	    	
	    	XSSFRow row =sheet.getRow(r);// ek ek row iterate hoga
	    	
//	    	System.out.println("row is:"+row);
	    	
	    	for(int c=0;r<=columns;c++) 
	    	{
	    		XSSFCell cell=row.getCell(c);
	    		
	    		switch(cell.getCellType()) {
	  		  case
	  		  STRING:System.out.print(cell.getStringCellValue()+"   ");
	  		  break; 
	  		  case
	  		  NUMERIC:System.out.print(cell.getNumericCellValue()+"  ");
	  		  break; 
	  		  case
	  		  BOOLEAN:System.out.print(cell.getBooleanCellValue()+" "); 
	  		  }
	    		
	    	}
	    	System.out.println();
	    }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	}
}

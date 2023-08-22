package selenium.topics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		ReadingExcel.readExcel();
	}
	public static void readExcel() {
		 try {
			 String filePath=System.getProperty("user.dir");
			XSSFWorkbook workBook=new XSSFWorkbook(filePath+"\\src\\test\\resources\\sampleExcel.xlsx");
			// XSSFWorkbook workBook=new XSSFWorkbook(filePath+"\\Excel\\sampleExcel.xlsx");
			 XSSFSheet sheet = workBook.getSheet("Sheet1");
//			 int rows=sheet.getLastRowNum();  
			int rows=sheet.getPhysicalNumberOfRows();
		  System.out.println("Number of rows is: " + rows);
			   
//			   int columns= sheet.getRow(1).getLastCellNum();
			   
//			   for(int r=0;r<=rows;r++)
//			    {
//			    	
//			    	XSSFRow row =sheet.getRow(r);// ek ek row iterate hoga
//			    	
////			    	System.out.println("row is:"+row);
//			    	
//			    	for(int c=0;c<columns;c++) 
//			    	{
//			    		XSSFCell cell=row.getCell(c);
//			    		
//			    		switch(cell.getCellType()) {
//			  		  case
//			  		  STRING:System.out.print(cell.getStringCellValue()+"   ");
//			  		  break; 
//			  		  case
//			  		  NUMERIC:System.out.print(cell.getNumericCellValue()+"  ");
//			  		  break; 
//			  		  case
//			  		  BOOLEAN:System.out.print(cell.getBooleanCellValue()+" "); 
//			  		  }
//			    		
//			    	}
//			    	System.out.println();
//			    }
			   
			  // System.out.println("Number of cells is: " + columns); 
		} 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

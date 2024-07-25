import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//XSSFWorkbook accepts FileInputStream as an argument
		
		FileInputStream fis = new FileInputStream("C://Users//001YXW744//Desktop//DataDriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetscount=workbook.getNumberOfSheets();
		
		for(int i=0 ; i<sheetscount ;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Data1"))
              {
			         XSSFSheet sheet= workbook.getSheetAt(i);
              }
		}
		
	} 
	
	

}

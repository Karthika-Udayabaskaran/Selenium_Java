package testNg;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wb =new XSSFWorkbook("./data/testdata.xlsx");
	
	XSSFSheet sheetAt = wb.getSheetAt(0);
	
	//rowcount
	
	int lastRowNum = sheetAt.getLastRowNum();
	
	System.out.println(lastRowNum);
	
	//coulumn count 
	
	short lastCellNum = sheetAt.getRow(0).getLastCellNum();
	
	System.out.println(lastCellNum);
	
	for (int i=1; i<=lastRowNum;i++) {
		XSSFRow row2 =sheetAt.getRow(i);
		{
			for (int j =0;j <lastCellNum; j++) {
				
				XSSFCell cell2 = row2.getCell(j);
				String stringCellValue = cell2.getStringCellValue();
				
				System.out.println(stringCellValue);
				
			}
		}
		
	}
	
	}
	

}

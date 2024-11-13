package testNg;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {

//Open workbook
		XSSFWorkbook wb= new XSSFWorkbook("./data/testdata.xlsx");
//Go to specific sheet 
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		XSSFRow row = sheetAt.getRow(1);
		XSSFCell cell = row.getCell(1);
		
		String singleData = cell.getStringCellValue();
		System.out.println(singleData);
		
		int rowCount =sheetAt.getLastRowNum();
		
		System.out.println(rowCount);
		
		int columncount = sheetAt.getRow(0).getLastCellNum();

		System.out.println(columncount);
	}

}

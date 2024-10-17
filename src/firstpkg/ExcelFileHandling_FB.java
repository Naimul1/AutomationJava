package firstpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandling_FB 
{

	public static void readexceldata() throws Exception 
	{
		File f = new File ("C:\\Users\\Naimu\\OneDrive\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("sheet2");
		
		int r = sh1.getPhysicalNumberOfRows();
		
		for (int i = 0; i < r; i++)
		{
		XSSFRow row = sh1.getRow(i);
		int c = row.getPhysicalNumberOfCells();
		//System.out.println(r); //4 row
		
		for (int j = 0; j <c; j++) //i=0
		{
			
			XSSFCell col = row.getCell(j);
			
			if (col.getCellType() == CellType.NUMERIC)
			{
				double val = col.getNumericCellValue();
				System.out.println(val + "    ");
			}
			
			else 
			{
				String val = col.getStringCellValue();
				System.out.println(val + "   ");
			}
			
			System.out.println();
		}
		}
	}

		
//		//First Row data
//		XSSFRow row1 = sh1.getRow(0);
//		XSSFCell col1 = row1.getCell(0);
//		String val1 = col1.getStringCellValue();
//		System.out.println(val1);
//		
//		//Second Row data
//		XSSFRow row2 = sh1.getRow(1);
//		XSSFCell col2 = row2.getCell(0);
//		String val2 = col2.getStringCellValue();
//		System.out.print(val2 + "    ");
//		
//		XSSFCell col3 = row2.getCell(1);
//		String val3 = col3.getStringCellValue();
//		System.out.println(val3);
//		
//		//Third Row data
//		XSSFRow row3 = sh1.getRow(2);
	
	
	public static void main(String[] args) throws Exception {
		readexceldata();
	}
}

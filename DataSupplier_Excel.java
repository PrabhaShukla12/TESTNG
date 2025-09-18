package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplier_Excel {

	@DataProvider(parallel= true)
	public Object[][] login() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\Selenium\\ExcelData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet2");
		int rcount = sh.getPhysicalNumberOfRows();
		int Ccount = sh.getRow(0).getLastCellNum();

		System.out.println("Total Rows: " + rcount);
		System.out.println("Total Columns: " + Ccount);

		Object[][] data= new Object [rcount][Ccount];
		for (int i = 1; i < rcount-1; i++) {
			for (int j = 0; j < Ccount; j++) {
				
				DataFormatter df= new DataFormatter();
				data[i][j]= df.formatCellValue(sh.getRow(i).getCell(j));
				System.out.println(df.formatCellValue(sh.getRow(i).getCell(j))); 
			}
			System.out.println();
		}

		wb.close();
		fis.close();
		return data;
	}
}

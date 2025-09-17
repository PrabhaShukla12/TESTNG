package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier_DP {

	@DataProvider(name = "dp")
	public Object[][] DataSupply() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\Selenium\\ExcelData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		int cellcount = sh.getRow(0).getLastCellNum();

		System.out.println("Total rows: " + rowcount);
		System.out.println("Total column: " + cellcount);
		System.out.println();

		Object[][] data = new Object[rowcount - 1][cellcount];
		for (int i = 0; i < rowcount - 1; i++) {
			for (int j = 0; j < cellcount; j++) {
				DataFormatter df = new DataFormatter();
				data [i][j]= df.formatCellValue(sh.getRow(i+1).getCell(j));
				System.out.println(df.formatCellValue(sh.getRow(i+1).getCell(j)));
			}
		}

		wb.close();
		fis.close();
		return data;
	}

}

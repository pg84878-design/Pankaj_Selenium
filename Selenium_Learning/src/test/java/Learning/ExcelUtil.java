package Learning;


	

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	private Workbook workbook;
	private Sheet sheet;
	
	public ExcelUtil(String filePath,String sheetName) throws IOException
	{
	FileInputStream fis = new FileInputStream(filePath);
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheet(sheetName);
	}
	
	public int getRowCount()
	{
		return sheet.getLastRowNum();
	}
	public String getCellData(int rowNum,int colNum)
	{
		Row row = sheet.getRow(rowNum);
		return row.getCell(colNum).getStringCellValue();
	}
	
	public void close() throws IOException
	{
		workbook.close();
	}

}



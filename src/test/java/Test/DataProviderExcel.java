package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class DataProviderExcel 
{
	private org.apache.poi.ss.usermodel.CellType CellType;

	@Test(dataProvider = "logindata")
	public void login(String username , String password)
	{
		
	}

	@DataProvider(name = "logindata")
	public void passdata() throws IOException
	{
		FileInputStream fileInputStream=new FileInputStream("./xmlSheet/MultiUser.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fileInputStream);
		Sheet s=wb.getSheet("actitimelogin");
		
		Iterator<Row> rows=s.iterator();
		while (rows.hasNext()) 
		{
			Row row=rows.next();
			Iterator<Cell> cells=row.iterator();
		
		
			while(cells.hasNext())
			{
				Cell cell=cells.next();
				CellType =cell.getCellType();
				
			}
		}
		
	}

}

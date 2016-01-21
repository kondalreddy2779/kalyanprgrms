package selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelLinkTest {
	FirefoxDriver driver;
	@BeforeMethod
	public void lanunch(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void setUp() throws Exception{
		FileInputStream fi=new FileInputStream("D:\\kalyan\\selenium\\src\\com\\test\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		
		while(row.hasNext()){
			Row r=row.next();
			Cell c=r.getCell(0);
			String linknames=c.getStringCellValue();
			try{
			
				driver.findElement(By.linkText(linknames)).click();;
				String acturl=driver.getCurrentUrl();
				r.createCell(2).setCellValue(acturl);
				String expurl=r.getCell(1).getStringCellValue();
				if(acturl.equals(expurl)){
					r.createCell(3).setCellValue("PASSED");
				}
				else{
					r.createCell(3).setCellValue("FAIL");
				}
				driver.navigate().back();
			}catch(Exception e){
				r.createCell(3).setCellValue("link not found");
			}
		}
		FileOutputStream fo=new FileOutputStream("D:\\kalyan\\selenium\\src\\com\\test\\resultexcelfile\\links.xlsx");
		wb.write(fo);
		
		fo.close();
	}
}

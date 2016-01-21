package selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelLinks {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void links() throws Exception{
		FileInputStream fi=new FileInputStream("D:\\kalyan\\sw\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++){
			r=ws.createRow(i);
			c=r.createCell(0);
			c.setCellValue(links.get(i).getText());
			links.get(i).click();
			
			c=r.createCell(1);
			c.setCellValue(driver.getCurrentUrl());
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
			
			FileOutputStream fo=new FileOutputStream("D:\\kalyan\\sw\\links.xlsx");
			wb.write(fo);
			
			fo.close();
		}
	}
}

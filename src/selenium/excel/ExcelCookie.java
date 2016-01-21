package selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelCookie {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	@Test
	public void cookie() throws Exception{
		FileInputStream fi=new FileInputStream("D:\\kalyan\\selenium\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Set<Cookie> co=driver.manage().getCookies();
		Iterator<Cookie> it=co.iterator();
		System.out.println("this is itera");
		while(it.hasNext()){
			Cookie ck=it.next();
			r=ws.createRow(0);
			c=r.createCell(0);
			c.setCellValue(ck.getName());
			
			c=r.createCell(1);
			c.setCellValue(ck.getDomain());
			System.out.println("this is while");
		}
		System.out.println("this is efore out");
		FileOutputStream fo=new FileOutputStream("D:\\kalyan\\selenium\\Book1.xlsx");
		wb.write(fo);
		
		fo.close();
	}
}

package selenium.gridprog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GridDemo {
@Parameters("browser")
@Test
public void linkGrid(String b) throws IOException{
	DesiredCapabilities cap=null;
	if(b.equals("chrome")){
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}
	else if(b.equals("firefox")){
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	}
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("http://newtours.demoaut.com/");
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
	FileOutputStream fo=new FileOutputStream("D:\\kalyan\\selenium\\src\\com\\test\\resultexcelfile\\"+b+".xlsx");
	wb.write(fo);
	
	fo.close();
	
	
}
}

package selenium.pom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;


public class RegisterForm {
@FindBy(name="firstName")
WebElement firstname;
@FindBy(name="lastName")
WebElement lastname;
@FindBy(name="phone")
WebElement ph;
@FindBy(id="userName")
WebElement email;
@FindBy(name="address1")
WebElement add1;
@FindBy(name="address2")
WebElement add2;
@FindBy(name="city")
WebElement city;
@FindBy(name="state")
WebElement state;
@FindBy(name="postalCode")
WebElement postal;
@FindBy(name="country")
WebElement country;
@FindBy(name="register")
WebElement submit;
RemoteWebDriver driver=null;
public void register(RemoteWebDriver driver) throws IOException{
	this.driver=driver;
	String excel="D:\\kalyan\\selenium\\src\\com\\test\\excelfiles\\registration.xlsx";
	FileInputStream fi=new FileInputStream(excel);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Iterator<Row> row=ws.iterator();
	Row r=null;
	while(row.hasNext()){
		r=row.next();
		try{
			firstname.clear();
			firstname.sendKeys(r.getCell(0).getStringCellValue());
			lastname.clear();
			lastname.sendKeys(r.getCell(1).getStringCellValue());
			ph.clear();
			ph.sendKeys(r.getCell(2).getStringCellValue());
			email.clear();
			email.sendKeys(r.getCell(3).getStringCellValue());
			add1.clear();
			add1.sendKeys(r.getCell(4).getStringCellValue());
			//add2.sendKeys(r.getCell(5).getStringCellValue());
			city.clear();
			city.sendKeys(r.getCell(5).getStringCellValue());
			state.clear();
			state.sendKeys(r.getCell(6).getStringCellValue());
			postal.clear();
			postal.sendKeys(r.getCell(7).getStringCellValue());
			country.sendKeys(r.getCell(8).getStringCellValue());
			submit.click();
			driver.navigate().back();
			
		}catch(Exception e){
			
			System.out.println("Registation failed");
		}
	}
	
	FileOutputStream fo=new FileOutputStream("D:\\kalyan\\selenium\\src\\com\\test\\resultexcelfile\\pom.xlsx");
	wb.write(fo);
	fo.close();
	
	
}

}

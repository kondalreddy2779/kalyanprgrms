package selenium.dateandtime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableDate {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
	}
	@Test
	public void date(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Vijayawada, IN - Vijayawada (VGA)");
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		String date="10/06/2017";
		String[] splitdate=date.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int a=Integer.parseInt(splitdate[1]);
		String month=months[a-1];
		String year=splitdate[2];
		String day=splitdate[0];
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year)){
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month)){
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++){
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++){
				if(cols.get(j).getText().equals(day)){
					cols.get(j).click();
				}	
			}
		}
		driver.findElement(By.id("SearchBtn")).click();
	}
}

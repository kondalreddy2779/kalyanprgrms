package selenium.dateandtime;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SvrDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://svrtravels.com/");
		
	}
	@Test
	public void date() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='x']")).click();
		driver.findElement(By.xpath("//*[@id='main-home']/div[1]/form/div/input[1]")).click();
		driver.findElement(By.id("source_id")).sendKeys("Ongole");	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='destination_id']")).sendKeys("Chittoor");
		driver.findElement(By.id("datepicker")).click();
		
		/*String date="11/02/2016";
		String[] splitdate=date.split("/");
		String[] months={"January","February","December"};
		int a=Integer.parseInt(splitdate[1]);
		String year=splitdate[2];
		String month=months[a-1];
		String day=splitdate[0];
		String calmonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
		while(!calmonth.equals(month)){
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			calmonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
			System.out.println("this is calmonth while");
		}
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++){
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));	
			for(int j=0;j<cols.size();j++){
				if(cols.get(j).getText().equals(day)){
					cols.get(j).click();
				}
			}
			System.out.println("this is for1 close");
		}
		System.out.println("This is click button");
		driver.findElement(By.xpath("//*[@id='main-home']/div[1]/form/table/tbody/tr[5]/td/input[4]")).click();
		*/
	}
}

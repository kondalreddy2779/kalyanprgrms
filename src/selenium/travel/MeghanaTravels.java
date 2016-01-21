package selenium.travel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MeghanaTravels {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.meghanatravels.in/");
		driver.findElement(By.xpath("//*[@id='light']/a/img")).click();
	}
	@Test
	public void travel(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("triptype_oneway")).click();
		driver.findElement(By.xpath("//*[@id='searchbus_from_chosen']/a/div/b")).click();
		WebElement fromList=driver.findElement(By.xpath("//*[@id='searchbus_from_chosen']/div/ul"));
		fromList.findElement(By.xpath("//*[@id='searchbus_from_chosen']/div/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='searchbus_to_chosen']/a/div/b")).click();
		WebElement toList=driver.findElement(By.xpath("//*[@id='searchbus_to_chosen']/div"));
		toList.findElement(By.xpath("//*[@id='searchbus_to_chosen']/div/ul/li[4]")).click();
		
		driver.findElement(By.xpath("//*[@id='searchbus_depart-img']/table/tbody/tr/td[1]/img")).click();
		
		String date="2/02/2016";
		String[] splitdate=date.split("/");
		String[] months={"January","February"};
		int x=Integer.parseInt(splitdate[1]);
		String month=months[x-1];
		String year=splitdate[2];
		String day=splitdate[0];
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++){
			System.out.println("First for enterd");
			List<WebElement> cols=row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++){
				System.out.println("second for enterd");
				if(cols.get(j).getText().equals(day)){
					System.out.println("if enterd");
					cols.get(j).click();
					System.out.println("col date: "+cols.get(j).getText());
				}
			}
		}
		driver.findElement(By.xpath("//*[@id='search_submit_btn']")).click();
	}
}

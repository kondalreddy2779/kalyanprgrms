package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/hyderabad-news.aspx");
	}
	@Test
	public void newsLink(){
		WebElement text=driver.findElement(By.xpath("//div/a[@headerindex='14h']"));
		text.click();
		WebElement sublist=driver.findElement(By.xpath("//div/div/a[@href='news/newsitem.aspx?item=hyd-panel&no=18']"));
		sublist.click();
		driver.navigate().back();
		
	}
	
}

package selenium.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CssSelectorDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/hyderabad-news.aspx");
	}
	@Test
	public void css(){
		driver.findElement(By.cssSelector("a[href='hyderabad-news-inner.aspx?item=break89']")).click();
	}
}

package selenium.ajax;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxTest {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void ajax(){
		driver.findElement(By.className("gsfi")).sendKeys("selenium");
		Sleeper.sleepTightInSeconds(3);
		WebElement search=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> list=search.findElements(By.tagName("li"));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			
		}
	}
}

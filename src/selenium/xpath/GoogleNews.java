package selenium.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleNews {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
	}
	@Test
	public void headText(){
		List<WebElement> list=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
	}
	@AfterTest
	public void closeApp(){
		driver.close();
	}
}

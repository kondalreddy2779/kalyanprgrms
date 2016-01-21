package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SakshiDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.sakshi.com/");
	}
	@Test
	public void testSa(){
		WebElement link=driver.findElement(By.xpath("//li/a[@href='http://www.sakshi.com/news/andhra-pradesh/amrit-selection-of-beneficiaries-296813?pfrom=home-andhra-news']"));
		System.out.println(link.getText());
		link.click();
		
	}
}

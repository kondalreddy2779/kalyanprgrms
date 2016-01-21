package selenium.dropdown;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Demol {
	FirefoxDriver driver;
	@BeforeMethod 
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void linkTest(){
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}

}

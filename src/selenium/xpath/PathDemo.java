package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PathDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
	}
	@Test
	public void xpath(){
		WebElement link=driver.findElement(By.linkText("Login"));
		System.out.println(link.getText());
		link.click();
	}
	
}

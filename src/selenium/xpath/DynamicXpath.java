package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicXpath {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
	}
	@Test
	public void dynamic(){
		driver.findElement(By.id("sb_ifc0")).sendKeys("selenium");
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("//li/div[@class='sbqs_c']")).click();
	}
}

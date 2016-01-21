package ImplicitExplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitTest1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.pvrcinemas.com/");
	}
	@Test
	public void explicit(){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		driver.findElement(By.className("modal-skip")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[3]/div/div/div/span/a")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[4]/div/div/div/span/a"))).click();
		
	}
}

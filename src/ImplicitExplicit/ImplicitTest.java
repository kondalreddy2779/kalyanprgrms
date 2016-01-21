package ImplicitExplicit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitTest {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
	}
	@Test
	public void implicitTest(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.className("redir-overlay-close")).click();
		Actions action=new Actions(driver);
		WebElement department=driver.findElement(By.className("nav-line-2"));
		WebElement electronics=department.findElement(By.className("nav-text"));
		action.moveToElement(department).moveToElement(electronics).build().perform();
		
	}
}

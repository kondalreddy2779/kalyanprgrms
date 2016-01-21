package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseTest {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		ProfilesIni pf=new ProfilesIni();
		FirefoxProfile fp=pf.getProfile("kalyan");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.flipkart.com/");
		
	}
	@Test
	public void mouse(){
			Actions action=new Actions(driver);
			//driver.findElement(By.xpath("html/body/div[8]/div[2]/span"));
			WebElement elecronics=driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[1]/a/span"));
			action.moveToElement(elecronics).build().perform();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.linkText("Lenovo")).click();
		
	}
}

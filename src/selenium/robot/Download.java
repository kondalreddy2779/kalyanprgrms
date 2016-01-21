package selenium.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Download {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/");
	}
	@Test
	public void download() throws AWTException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.48.2")).click();
		Robot rd=new Robot();
		rd.keyPress(KeyEvent.VK_TAB);
		rd.keyRelease(KeyEvent.VK_TAB);
		Sleeper.sleepTightInSeconds(3);
		rd.keyPress(KeyEvent.VK_ENTER);
		rd.keyRelease(KeyEvent.VK_ENTER);
	}
}

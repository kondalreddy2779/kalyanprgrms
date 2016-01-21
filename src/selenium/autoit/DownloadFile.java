package selenium.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DownloadFile {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
	}
	@Test
	public void download() throws IOException{
		driver.findElement(By.linkText("2.48.2")).click();
		Sleeper.sleepTightInSeconds(5);
		Runtime.getRuntime().exec("D:\\kalyan\\auto\\download.exe");
	}
}

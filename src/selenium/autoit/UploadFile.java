package selenium.autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://imgur.com/");
	}
	@Test
	public void upload() throws IOException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("upload-global-file-wrapper")).click();
		Runtime.getRuntime().exec("D:\\kalyan\\auto\\upload.exe");
		driver.findElement(By.id("upload-global-start-button")).click();
		
	}
}

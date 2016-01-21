package selenium.irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	}
	@Test
	public void demoTest(){
		driver.findElement(By.id("usernameId")).sendKeys("gfuysdg");
		driver.findElement(By.className("loginPassword")).sendKeys("hsgvdyuvzhgx");
		driver.findElement(By.className("loginCaptcha"));
		String text=driver.findElement(By.id("cimage")).getText();
		System.out.println("Text   "+text);
		
	}
}

package selenium.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToursDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test(priority=0)
	public void registration(){
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("kalyan");
		driver.findElement(By.name("lastName")).sendKeys("chakravarthi");
		driver.findElement(By.name("phone")).sendKeys("8106449857");
		driver.findElement(By.name("userName")).sendKeys("chakravarthi.kalyan@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("hyd");
		driver.findElement(By.name("address2")).sendKeys("ammerpet");
		driver.findElement(By.name("city")).sendKeys("hyd");
		driver.findElement(By.name("state")).sendKeys("AP");
		driver.findElement(By.name("postalCode")).sendKeys("500024");
		driver.findElement(By.name("country")).sendKeys("ANDORRA ");
		driver.findElement(By.name("email")).sendKeys("kalyan");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.linkText("sign-in")).click();
	}
	@Test(priority=1)
	public void sigin(){
		driver.findElement(By.name("userName")).sendKeys("kalyan");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
	}
	 
}

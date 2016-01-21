package selenium.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://professional.demo.orangehrmlive.com/auth/login");
	}
	@Test(priority=0)
	public void login(){
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test(priority=1)
	public void admin(){
		System.out.println("This is admin");
		WebElement menutext=driver.findElement(By.xpath("//div/ul[@class='sf-js-enabled']"));
		List<WebElement> menulist=menutext.findElements(By.tagName(""));
		System.out.println(menulist.size());
		for(int i=0;i<menulist.size();i++){
			System.out.println(menulist.get(i).getText());
			if(menulist.get(i).isDisplayed()){
				menulist.get(i).click();
			}
		}
	}
	
}

package selenium.Demos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiple {
	WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
	}
	@Test(priority=0)
	public void windows(){
		String title=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		try{
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			String title1=driver.getTitle();
			if(!title.equals(title1)){
				driver.findElement(By.xpath("//li/a[@id='privacyLabel']")).click();
				break;
			}
			
		}
		
		}catch(Exception e){
			System.out.println("This is else part");
		}
		
	}
}

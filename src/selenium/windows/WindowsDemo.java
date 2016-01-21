package selenium.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowsDemo {
	WebDriver driver;
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\kalyan\\sw\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.bing.com/");
	}
	@Test
	public void windows(){
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			String title=driver.getTitle();
			if(!title1.equals(title)){
				driver.findElement(By.xpath("//li/a[@id='privacyLabel']")).click();
				break;
			}
			
		}
		
		
	}
}

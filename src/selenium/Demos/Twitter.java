package selenium.Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Twitter {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("https://twitter.com/");
	}
	@Test
	public void twitter(){
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(list.size());
		String names[]={"kalyan","kaa","kalyan","siva","nikhil","rahul","mahendra","1984564947"};
		for(int i=0;i<list.size();i++){
			if(list.get(i).isDisplayed()){
				list.get(i).sendKeys(names[i]);
				System.out.println(list.get(i).getText());
			}
		}
	}
}

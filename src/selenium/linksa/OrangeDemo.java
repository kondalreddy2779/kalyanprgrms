package selenium.linksa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeDemo {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++)
			{
			if(list.get(i).isDisplayed())
			{
				list.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				list=driver.findElements(By.tagName("a"));
			}
			}
		driver.close();

	}

}

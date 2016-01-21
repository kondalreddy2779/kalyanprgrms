package selenium.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioDemo1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		ProfilesIni ps=new ProfilesIni();
		FirefoxProfile fp=ps.getProfile("kalyan");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.utexas.edu/learn/forms/radio.html");
	}
	@Test
	public void radioCheck(){
		WebElement list=driver.findElement(By.xpath(".//*[@id='mainContentNav']/form/table/tbody/tr[2]/td[1]"));
		List<WebElement> drop=list.findElements(By.name("title"));
		for(int i=0;i<drop.size();i++){
			drop.get(i).click();
			for(int j=0;j<drop.size();j++){
				System.out.println(drop.get(j).getAttribute("value")+"----"+drop.get(j).getAttribute("checked"));
			}
			System.out.println("************");
		}
	}
	@AfterTest
	public void closeApp(){
		driver.close();
	}
}

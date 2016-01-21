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

public class RadioButtonTest {
	FirefoxDriver driver;
	@BeforeTest
	public void initial(){
		ProfilesIni ps=new ProfilesIni();
		FirefoxProfile fp=ps.getProfile("kalyan");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println("This is initial method");
	}
	@Test
	public void radioButtonsTest(){
		WebElement list=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement> radio=list.findElements(By.name("group1"));
		for(int i=0;i<radio.size();i++){
			System.out.println(radio.get(i).getAttribute("value")+"--"+radio.get(i).getAttribute("checked"));
		}
		System.out.println("This is radioButtons method");
	}
	@AfterTest
	public void closeApp(){
		System.out.println("This is close method");
		driver.close();
		
	}
}

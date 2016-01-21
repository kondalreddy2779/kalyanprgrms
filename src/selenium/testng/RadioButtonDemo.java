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

public class RadioButtonDemo {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		ProfilesIni ps=new ProfilesIni();
		FirefoxProfile fp=ps.getProfile("kalyan");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
	}
	@Test
	public void radioButton(){
		WebElement list=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement> radio=list.findElements(By.name("group1"));
		for(int i=0;i<radio.size();i++){
			radio.get(i).click();
			for(int j=0;j<radio.size();j++){
				System.out.println(radio.get(j).getAttribute("value")+"--"+radio.get(j).getAttribute("checked"));
			}
			System.out.println("********************");
		}
		List<WebElement> radio1=list.findElements(By.name("group2"));
		for(int k=0;k<radio1.size();k++){
			radio1.get(k).click();
			for(int l=0;l<radio1.size();l++){
				System.out.println(radio1.get(l).getAttribute("value")+"--"+radio1.get(l).getAttribute("checked"));
			}
			System.out.println("********************");
		}
	}
	@AfterTest
	public void closeApp(){
		driver.quit();
	}

}

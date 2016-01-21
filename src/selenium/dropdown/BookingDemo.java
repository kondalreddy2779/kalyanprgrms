package selenium.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BookingDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\kalyan\\sw\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.booking.com");
		System.out.println("this is login");
		driver.findElement(By.name("ss")).sendKeys("ooti");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		System.out.println("this is SEnd keys");
		WebElement check=driver.findElement(By.className("b-form-group__content"));
		List<WebElement> drop=check.findElements(By.tagName("option"));
		for(int i=1;i<drop.size();i++)
		{
			drop.get(i).click();
			if(drop.get(i).isSelected())
			{
				List<WebElement> year=driver.findElements(By.tagName("option"));
				for(int j=0;j<year.size();j++)
				{
					year.get(j).click();
				}
			}
		}
		
	}

}

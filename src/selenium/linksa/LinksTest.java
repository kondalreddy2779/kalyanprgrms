package selenium.linksa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.goair.in/");
		WebElement fromdrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> list=fromdrop.findElements(By.tagName("option"));
		System.out.println(list.size());
		for(int i=1;i<list.size();i++)
		{
			String names=list.get(i).getText();
			list.get(i).click();
			WebElement todrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			if(todrop.getText().equals(names))
			{
				System.out.println(list.get(i).getText()+ " This is invalid ");
			}
			else
			{
				System.out.println(list.get(i).getText()+" This is valid");
			}
			
		}
		driver.close();

	}

}

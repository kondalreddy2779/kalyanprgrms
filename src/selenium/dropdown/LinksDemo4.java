package selenium.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksDemo4 {

	public static void main(String[] args) {
		String exp = null;
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://goair.in");
		Sleeper.sleepTightInSeconds(4);
		WebElement drop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> list=drop.findElements(By.tagName("option"));
		System.out.println(list.size());
		for(int i=1;i<list.size();i++)
		{
			list.get(i).click();
			String act=list.get(i).getText();
			WebElement drop2=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			List<WebElement> list2=drop2.findElements(By.tagName("option"));
			for(int j=1;j<list2.size();j++)
			{
				list2.get(j).click();
				exp=list2.get(j).getText();
			}
			if(!act.equals(exp))
			{
				System.out.println(list.get(i).getText()+" is active");
			}
			else
			{
				System.out.println(list.get(i).getText()+" is inactive");
			}
		}
		driver.close();
	}

}

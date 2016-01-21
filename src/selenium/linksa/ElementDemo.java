package selenium.linksa;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDemo {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Kalyan");
		String name=driver.getPageSource();
		int count=driver.getPageSource().split("kalyan").length-1;
		System.out.println(count);
		if(name.contains("kalyan"))
		{
			System.out.println("This element is present");
		}
		else
		{
			System.out.println("This elements is not present");
		}
		driver.close();

	}

}

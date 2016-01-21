package selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase1 {

	@Test
	public void login(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		NewTours nt=PageFactory.initElements(driver, NewTours.class);
		nt.findAFlight("tutorail", "tutorail");
		
	}
}

package selenium.cookies;

import java.util.Iterator;
import java.util.Set;

//import javax.servlet.http.Cookie;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CookiesTest {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	@Test
	public void cookies(){
		Set<org.openqa.selenium.Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		Iterator<org.openqa.selenium.Cookie> it=cookie.iterator();
		while (it.hasNext()) {
			org.openqa.selenium.Cookie c=it.next();
			System.out.println(c.getName()+"---"+c.getDomain());
		}
		driver.manage().deleteAllCookies();
		System.out.println("After");
		Set<org.openqa.selenium.Cookie> cookie1=driver.manage().getCookies();
		System.out.println(cookie1.size());
	}
}

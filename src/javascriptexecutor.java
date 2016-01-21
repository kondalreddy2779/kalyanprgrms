import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class javascriptexecutor {
	public static void main (String[] args){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello friends');");
		Sleeper.sleepTight(9);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

}

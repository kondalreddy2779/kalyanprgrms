package selenium.pom;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegistrationTestCase1 {
	@Parameters("browser")
	
	@Test
	public void registration(String b) throws IOException{
		DesiredCapabilities cap=null;
		if(b.equals("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com/");
		NewToursTopMenu ntm=PageFactory.initElements(driver, NewToursTopMenu.class);
		RegisterForm rf=PageFactory.initElements(driver,RegisterForm.class);
		NewToursLeftMenu nlm=PageFactory.initElements(driver, NewToursLeftMenu.class);
		ntm.register();
		rf.register(driver);
		nlm.homeLink();
		
	}
}

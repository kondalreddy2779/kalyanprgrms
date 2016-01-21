package selenium.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class BookAFlight extends DriverConstant{
	@Test
	public void bookaFlight(){
		driver.findElement(By.name("passFirst0")).sendKeys("kalyan");
		driver.findElement(By.name("passLast0")).sendKeys("ch");
		driver.findElement(By.name("pass.0.meal")).sendKeys("Hindu");
		driver.findElement(By.name("buyFlights")).click();
		
	}
}

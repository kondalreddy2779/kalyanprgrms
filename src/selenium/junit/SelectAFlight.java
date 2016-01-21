package selenium.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class SelectAFlight extends DriverConstant{
	@Test
	public void selectFlight(){
		driver.findElement(By.name("outFlight")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
	}
}

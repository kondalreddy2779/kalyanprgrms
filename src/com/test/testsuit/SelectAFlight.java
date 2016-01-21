package com.test.testsuit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectAFlight extends DriverConstant{
	@Test
	public void selectFlight(){
		driver.findElement(By.name("outFlight")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
	}
}

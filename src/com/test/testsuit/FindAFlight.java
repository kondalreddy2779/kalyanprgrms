package com.test.testsuit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindAFlight extends DriverConstant{
	@Test
	public void findFlight(){
		driver.findElement(By.name("tripType")).click();
		driver.findElement(By.name("passCount")).sendKeys("1");
		driver.findElement(By.name("fromPort")).sendKeys("London");
		driver.findElement(By.name("fromMonth")).sendKeys("April");
		driver.findElement(By.name("fromDay")).sendKeys("6");
		driver.findElement(By.name("servClass")).click();
		driver.findElement(By.name("airline")).sendKeys("Unified Airlines");
		driver.findElement(By.name("findFlights")).click();
		
	}
}

package com.test.testsuit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Confirmation extends DriverConstant{
	@Test
	public void confirmation(){
		String exp="Your itinerary has been booked!";
		String act=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(exp.equals(act)){
			System.out.println("Your flight booking is sucessfully");
		}
		else
		{
			System.out.println("sorry try agin");
		}
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
		
	}

}

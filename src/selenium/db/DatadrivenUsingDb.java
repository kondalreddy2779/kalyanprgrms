package selenium.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenUsingDb {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void data() throws SQLException, ClassNotFoundException{
		Connection con=null;
		String dbUrl = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(dbUrl,username,password);
		PreparedStatement pstmt=con.prepareStatement("select * from register");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			driver.findElement(By.name("firstName")).sendKeys(rs.getString(1));
			driver.findElement(By.name("lastName")).sendKeys(rs.getString(2));
			driver.findElement(By.name("phone")).sendKeys(rs.getString(3));
			driver.findElement(By.name("userName")).sendKeys(rs.getString(4));
			driver.findElement(By.name("address1")).sendKeys(rs.getString(5));
			driver.findElement(By.name("city")).sendKeys(rs.getString(6));
			driver.findElement(By.name("state")).sendKeys(rs.getString(7));
			driver.findElement(By.name("postalCode")).sendKeys(rs.getString(8));
			driver.findElement(By.name("country")).sendKeys(rs.getString(9));
			driver.findElement(By.name("register")).click();
			driver.navigate().back();
		}
		con.close();
	}
}

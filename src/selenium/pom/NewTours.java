package selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTours {
@FindBy(name="userName")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement login;
@FindBy(linkText="your destination")
WebElement destination;
@FindBy(linkText="featured vacation destinations")
WebElement vacation;
@FindBy(linkText="Register here")
WebElement register;
@FindBy(linkText="Business Travel @ About.com")
WebElement business;
@FindBy(linkText="Salon Travel")
WebElement salon;

public void findAFlight(String username,String password){
	this.username.sendKeys(username);
	this.password.sendKeys(password);
	login.click();
}
public void destinations(){
	destination.click();
}
public void vacations(){
	vacation.click();
}
public void register(){
	register.click();
}
public void links(){
	business.click();
	salon.click();
}

}

package selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursTopMenu {
@FindBy(linkText="SIGN-ON")
WebElement sign_on;
@FindBy(linkText="REGISTER")
WebElement register;
@FindBy(linkText="SUPPORT")
WebElement support;
@FindBy(linkText="CONTACT")
WebElement contact;

public void signOn(){
	sign_on.click();
}
public void register(){
	register.click();
}
public void support(){
	support.click();
}
public void contact(){
	contact.click();
}

}

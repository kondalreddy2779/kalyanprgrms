package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	FirefoxDriver driver=null;
	@Given("^the browser is launched and the url is navigated to$")
	public void the_browser_is_launched_and_the_url_is_navigated_to() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrm.com/");
	}


	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
		
	}

	@Then("^welcome admin msg displayed$")
	public void welcome_admin_msg_displayed() throws Throwable {
		String exp="Welcome Admin";
		String act=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(exp, act);
	}
	@When("^we click on welcome admin$")
	public void we_click_on_welcome_admin() throws Throwable {
	  driver.findElement(By.id("welcome")).click();
	}

	@When("^then click on logout$")
	public void then_click_on_logout() throws Throwable {
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^home page url should be displayed$")
	public void home_page_url_should_be_displayed() throws Throwable {
	    String expurl="";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(expurl, acturl);
	    
	}


}

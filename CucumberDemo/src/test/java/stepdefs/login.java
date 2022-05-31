package stepdefs;

import java.io.IOException;

import org.junit.Assert;

import PageObjects.Landingpage;
import PageObjects.siginpage;
import Resources.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends base {
	
	@Before
	public  void browseropen() throws IOException
	{
		driver =Openbrowser();
	}
	@After
	public  void browserclose() throws IOException
	{
		driver.quit();
	}
	
	@Given("user open browser")
	public void user_open_browser() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	@When("user enter credentails")
	public void user_enter_credentails() throws InterruptedException {
		String username=prop.getProperty("username");
		Landingpage l = new Landingpage(driver);
		l.login().click();
		siginpage lp = new siginpage(driver);
		lp.Email().sendKeys(prop.getProperty("username"));
		Thread.sleep(4000);
		lp.Password().sendKeys(prop.getProperty("password"));
		Thread.sleep(4000);

		lp.Login().click();
		Assert.fail();
	}

	
	
	
	@When("user logins {string} and {string}")
	public void user_logins_and(String username, String password) throws InterruptedException {
		
		Landingpage l = new Landingpage(driver);
		l.login().click();
		siginpage lp = new siginpage(driver);
		lp.Email().sendKeys(username);
		Thread.sleep(4000);
		lp.Password().sendKeys(password);
		Thread.sleep(4000);

		lp.Login().click();
	   
	}

}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class siginpage {
	public WebDriver driver;

	 private By emailid =By.xpath("//input[@id='user_email']");
	 private By password =By.xpath("//input[@id='user_password']");
	 private By login =By.xpath("//input[@name='commit']");

	public siginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement Email()
	{
		 return driver.findElement(emailid);
	}
	public WebElement Password()
	{
		 return driver.findElement(password);
	}
	public WebElement Login()
	{
		 return driver.findElement(login);
	}
	
	

}

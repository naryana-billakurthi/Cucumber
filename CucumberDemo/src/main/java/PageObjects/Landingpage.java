package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	public WebDriver driver;

	 private By loginin =By.xpath("//span[normalize-space()='Login']");
	 
	 public Landingpage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public WebElement login()
	 {
		 return  driver.findElement(loginin);
	 }

}

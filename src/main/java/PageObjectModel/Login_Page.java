package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	public WebDriver driver;					//  import driver from webdriver 
	
	
	// get the xpath of  page  we want to click on button 
	By username=By.xpath("//input[@id='username']");   	// create xpath of login button 
	
	By password=By.xpath("//input[@id='password']");			// create xpath  of password button 
	
	By loginbutton=By.xpath("//input[@id='Login']");			//  xpath of login button 
	
	By tryforfree=By.xpath("//a[@id='signup_link']");			// xpath of tryforfree button 
	
	
	// only define xpath in this webelement 
	
	public Login_Page(WebDriver driver2) {				// in this constructer has scope on test casees page
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement enterusername() {
		return driver.findElement(username);		// declare xpath of login button 
		
	}
	
	public WebElement enterpassword() {				// call return in password button xpath 
		return driver.findElement(password);
		
	}

	public WebElement loginbutton() {					// call  return login button 
		return driver.findElement(loginbutton);
		
	}
	public WebElement tryforfree() {
		return driver.findElement(tryforfree);
		
		
	}
}

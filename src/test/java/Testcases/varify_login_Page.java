package Testcases;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.Login_Page;
import Resources.BaseClass;
import Resources.constants;


//This is for demo purpose

public class varify_login_Page extends BaseClass {  			// extends resources - baseclass all methods for lounch login button 

	@Test
	public void LogInVaification() throws IOException, InterruptedException {     		// call 
		
		
//		driver=driverinitilization();								// call driver= driverinitilization 
//		driver.get("https://login.salesforce.com/?locale=in");			// open our website (url)
	
	Login_Page lp=new Login_Page(driver);				// create object  of login_page (resources)
	
	lp.enterusername().sendKeys(constants.username);		// username can hide in constants class in resources file and call in verify page 
	
	lp.enterpassword().sendKeys(constants.password);		// password can be hide in constants class and call in verify page 
																	// constants class is static class 
	
	lp.loginbutton().click();
	lp.tryforfree().click();
	
	
	// when check the login status(when your login was failed then we use hard asseartion.that time your login i failed using expected , actual 
	// firstly assign expected then create actual and assign value  
	
	// we use two type of assertion 
	/* 1.soft assertion 
	 * 2. hard assertion 
	 * 
	 * syntax of hard assertion 
	 *  String actualtext= driver.findElement(By.xpath("//div[@id='error']")).getText();			// to get alart massege using xpath of error 
	
		String expected= "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
 
		Assert.assertEquals(actualtext, expected);
	 * 
	 */
	Thread.sleep(3000);
	String actualtext= driver.findElement(By.xpath("//div[@id='error']")).getText();			// to get alart massege using xpath of error 
	
	String expected= "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
 
	Assert.assertEquals(actualtext, expected);
	
	}
	
	
}

package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.Login_Page;
import Resources.BaseClass;

public class varify_login_Page extends BaseClass {  			// extends resources - baseclass all methods for lounch login button 

	@Test
	public void LogInVaification() throws IOException {     		// call 
		
		
		driver=driverinitilization();								// call driver= driverinitilization 
		driver.get("https://login.salesforce.com/?locale=in");			// open our website (url)
	
	Login_Page lp=new Login_Page(driver);				// create object  of login_page (resources)
	
	lp.enterusername().sendKeys("Anant");
	
	lp.enterpassword().sendKeys("Anant@123");
	
	lp.loginbutton().click();
	lp.tryforfree().click();
	
	

	 
	}
	
}

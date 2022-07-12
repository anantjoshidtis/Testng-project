package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.Login_Page;
import PageObjectModel.signup_page;
import Resources.BaseClass;

public class Verify_signup extends BaseClass {
	@Test
	public void signup() throws IOException, InterruptedException {
		driverinitilization();
		
		driver.get("https://login.salesforce.com/?locale=in");			// login page link 
		
		Login_Page lp=new Login_Page(driver);	
		
		lp.tryforfree().click();
		
		signup_page sp=new signup_page(driver);		// create object to signup_page object 
		
		 Thread.sleep(10000);
		 sp.firstname().sendKeys("Anant");				// this is first name 
		 
		sp.lastname().sendKeys("Joshi");			// last name 
		
		sp.Work_email().sendKeys("anant.joshi@dypds.com");			// mail id 
		
		sp.selectjobtitle().click();				// store xpath of job title 
		
		 Select s=new Select(sp.selectjobtitle());		// we use select class method  
		 s.selectByIndex(2);
		 
		  sp.Select_compan_details().sendKeys("Technogeeks, Aundh Baner ");
		  
		Select s2=new Select(sp.Select_employee());
		
		s2.selectByIndex(3);      			// we use select method and select 2nd index of employee 
		
		
		sp.Select_Contact_number().sendKeys("9503256541");     	// enter contact number 
		
		
		Select s3=new Select(sp.Select_Country());
		
		s3.selectByValue("ID");				// we use select method and select by value as India 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

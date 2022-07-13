package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup_page {
	
	public WebDriver driver;
	
	By firstname =By.xpath("//input[@name='UserFirstName']");    // xpath of firstname 
	
	By lastname=By.xpath("//input[@name='UserLastName']");		// xpath of lastname 
	
	By work_email=By.xpath("//input[@type='email']");			// xpath of work_email
	
	By jobTitle = By.xpath("//select[@name='UserTitle']");			// xpath of job tittle 
 
	 By Select_company=By.xpath("//input[@name='CompanyName']");		// xpath of company 
	
	 By Select_employee=By.xpath("//select[@name='CompanyEmployees']");  		// xpath of select employee 
	
	 By phone_number=By.xpath("//input[@name='UserPhone']");    // xpath of contact number 
	
	By Select_Country=By.xpath("//select[@name='CompanyCountry']");			// xpath of select country  
	
	
	
	
	
	public signup_page(WebDriver driver2) {					// create constructer in ignup_paage 
 	this.driver=driver2;
	
	}


	public WebElement firstname() {					// this is  first name 
	return driver.findElement(firstname);	
}

	public WebElement lastname() {
	return driver.findElement(lastname);			// this is last name 
}

	public WebElement Work_email() {				// this  is email id 
		return driver.findElement(work_email);
		
	}
 
		public WebElement selectjobtitle () {		// select job tite 
			
			 return driver.findElement(jobTitle);
		}
	
		 
		public WebElement Select_compan_details() {			// select company details
			return driver.findElement(Select_company);
	
}

		public WebElement Select_employee() {				// select employee
			return driver.findElement(Select_employee);
			
		}


		public WebElement Select_Contact_number () {		// enter contact number 
			
			return driver.findElement(phone_number);
			
		}

		public WebElement Select_Country() {				// select country using locater 
			return driver.findElement(Select_Country);
			
		}




}
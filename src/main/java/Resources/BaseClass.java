package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver driverinitilization () throws IOException {
		
		// to read the file :- data . property   
 		
		FileInputStream fis=new FileInputStream("C:\\Users\\3str\\eclipse-workspace\\E2ETestNgFreamework\\src\\main\\java\\Resources\\data.properties");
		
		
		Properties prop= new Properties();     // to access the .properties 
		
		prop.load(fis);    // to access read file  becouse 
		
		 String BrowserName=prop.getProperty("browser");
		
		 if (BrowserName.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\3str\\Desktop\\chrome driver\\chromedriver.exe");
			    driver = new ChromeDriver();	
	}
	
		 else if (BrowserName.equalsIgnoreCase("firefox")) {
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\3str\\Desktop\\chrome driver\\chromedriver.exe");
//			    WebDriver driver = new ChromeDriver();
			     		
	}
		 else  if (BrowserName.equalsIgnoreCase("Edge")) {
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\3str\\Desktop\\chrome driver\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
			 }
		 
		 else {
			 System.out.println(" please select  valid browser name ");
		 }
		 
		  return driver;
		  
		 
	}

	 
	   
	
}

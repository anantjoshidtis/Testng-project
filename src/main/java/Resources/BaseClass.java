package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver driverinitilization () throws IOException {
		
		// to read the file :- data . property   
 		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");		// change path for use code different setup 
		
		
		  prop= new Properties();     // to access the .properties 
		
		prop.load(fis);    // to access read file   
		
		 String BrowserName=prop.getProperty("browser");
		
		 if (BrowserName.equalsIgnoreCase("chrome")) {
			
//			 WebDriverManager.chromedriver.version("101.0.4951.54").setup();   // use  specific version of chrome driver 
			 
			 WebDriverManager.chromedriver().setup();			// path of chromedriver for automatically updated chrome in browser 
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
	@BeforeMethod
	public void browserLaunch() throws IOException {
		driver=driverinitilization();								// call driver= driverinitilization 
	 
		
		driver.get(prop.getProperty("url"));
	
	}
	   
	@AfterMethod
	public void Chromequit() throws IOException {
		 driver.quit();								// quite tab after run page   
	}
		
		 
}

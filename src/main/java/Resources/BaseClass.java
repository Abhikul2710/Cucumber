package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	
	public WebDriver driver;
	public WebDriver Initializedriver() throws IOException {
		
		
		Properties prop = new Properties();
		
		//To read the data from properties file
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		prop.load(fis); //To load the data
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ABHISHEK\\Desktop\\selenium jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else if(browserName.equals("IE")) {
			//IE
		}
		else {
			System.out.println("Please select atleast one browser");
		}
		
		return driver;
		
	}
	
	@BeforeMethod
	public void urllaunch() throws IOException {
		
		driver=Initializedriver();    //This driver has scope
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
	}	

}

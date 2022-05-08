package StepDefinitionFiles;

	import org.junit.runner.RunWith;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.LoginPOM;
import Resources.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.openqa.selenium.chrome.ChromeDriver;

	@RunWith(Cucumber.class)
	public class StepDefinitionLogin extends BaseClass{
		public WebDriver driver;
	    @Given("^Launch the chrome browser$")
	    public void launch_the_chrome_browser() throws Throwable {
	    driver=Initializedriver();
	    }

	    @And("^Navigate to the salesforce url$")
	    public void navigate_to_the_salesfocre_url() throws Throwable {
	    driver.get("https://login.salesforce.com/?locale=in");
	    driver.manage().window().maximize();
	    }
	    
	    @When("^username enters the username and password then user is able to login$")
	    public void username_enters_the_username_and_password_then_user_is_able_to_login() throws Throwable {
	    LoginPOM obj = new LoginPOM(driver);
	    obj.username().sendKeys("Ak.salesforce");
	    obj.password().sendKeys("Abhikul27!");
	    obj.login().click();
	    }
	    
	}
	
	


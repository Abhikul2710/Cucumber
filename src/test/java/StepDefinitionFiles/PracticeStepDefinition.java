package StepDefinitionFiles;

	import org.junit.runner.RunWith;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.cucumber.junit.Cucumber;

		@RunWith(Cucumber.class)
		public class PracticeStepDefinition {
		public WebDriver driver;
			
			@Before public void start() {
			System.out.println("Start the scenarios");
			}
			
		    @Given("^Initialize the Chrome Browser$")
		    public void initialize_the_chrome_browser() throws Throwable {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Desktop\\selenium jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		    }

		    @And("^Navigate to the \"([^\"]*)\"$")
		    public void navigate_to_the_something(String strArg1) throws Throwable {
		    driver.get(strArg1);
			driver.manage().window().maximize();
		    }
		    
		    @When("^user enters (.+) and (.+)$")
		    public void user_enters_and(String username, String password) throws Throwable {
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
		    }

		    @Then("^user should be able to Login$")
		    public void user_should_be_able_to_login() throws Throwable {
		    driver.findElement(By.xpath("//input[@id='Login']")).click();
		    }
		    
		    @And("^clicks on Login button$")
		    public void clicks_on_login_button() throws Throwable {
		    System.out.println("Logged in successfully");  
		    }
		    

		    @When("^user clicks on Forgot password$")
		    public void user_clicks_on_forgot_password() throws Throwable {
		    driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		    }

		    @Then("^user goes to the different page$")
		    public void user_goes_to_the_different_page() throws Throwable {
		    System.out.println("Lands on different page");
		    }

		    @When("^user clicks on Continue tab$")
		    public void user_clicks_on_continue_tab() throws Throwable {
		    driver.findElement(By.xpath("//input[@name='continue']")).click();
		    }

		    @Then("^the page refreshes$")
		    public void the_page_refreshes() throws Throwable {
		    System.out.println("Please enter the new password");
		    }

		    @After public void exit() {
		    System.out.println("Finally ends");
		    }
		}


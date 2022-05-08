package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//new comment added
public class LoginPOM {
	public WebDriver driver;
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@name='pw']");
	private By login = By.xpath("//input[@id='Login']");
	
	
	
	public LoginPOM(WebDriver driver2) {
	this.driver=driver2;
	}

	public WebElement username() {
	return driver.findElement(username);
	}
	
	public WebElement password() {
	return driver.findElement(password);
	}
	
	public WebElement login() {
	return driver.findElement(login);
	}

}

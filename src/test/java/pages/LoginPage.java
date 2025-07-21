package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// Locators
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	this.driver = driver;
	}

	By txt_username = By.xpath("//input[@id='user-name']");
	By txt_password = By.xpath("//input[@id='password']");
	By loginBtn = By.id("login-button");
	By home_Logo = By.xpath("//div[@class='app_logo']");

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(loginBtn).click();
	}

	public boolean isLoginSuccessful() {
	return driver.findElement(home_Logo).isDisplayed();
	
	}
	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(loginBtn).click();

	}
}
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement txt_uername;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginBtn;
	
	

	public void enterUsername(String username) {
		txt_uername.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

	public LoginPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

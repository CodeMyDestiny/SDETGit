package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	WebDriver driver;

	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement cartEl;
	
	public void isCartDisplayed() {
		cartEl.isDisplayed();
	}
	
	public HomePageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

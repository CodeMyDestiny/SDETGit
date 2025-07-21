/*
 * package stepdefinitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pages.LoginPage;
 * 
 * public class POMLoginStepDefinitions { static WebDriver driver; LoginPage
 * loginPage;
 * 
 * @Given("User is on the login page") public void user_is_on_the_login_page() {
 * driver = new ChromeDriver();
 * 
 * // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * 
 * driver.get("https://www.saucedemo.com/v1/index.html"); }
 * 
 * // @When("User enters username and password")
 * 
 * @When("User enters {string} and {string}") public void
 * user_enters_username_and_password(String username, String password) {
 * loginPage = new LoginPage(driver); loginPage.enterUsername(username);
 * loginPage.enterPassword(password);
 * 
 * }
 * 
 * @And("Clicks on login button") public void clicks_on_login_button() {
 * 
 * // driver.findElement(By.xpath("//input[@id='login-button']")).click();
 * loginPage.clickLoginButton(); }
 * 
 * @Then("User should be redirected to the home page") public void
 * user_should_be_redirected_to_the_home_page() {
 * 
 * Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).
 * size() > 0, "User has been redirected to home page");
 * 
 * loginPage.isLoginSuccessful(); }
 * 
 * @And("Close the browser") public void close_the_browser() { driver.quit(); }
 * }
 */
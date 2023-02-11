package meuprojeto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAmazon extends Page {
	

	public LoginAmazon(WebDriver driver) {
		super(driver);
		driver.get("http://www.amazon.com.br/login");
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getContinueLogin() {
		return driver.findElement(By.id("continue"));
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.id("id_password"));
	}
	
	public WebElement getButtonLogin() {
		return driver.findElement(By.id("signInSubmit"));
	}

	public void login(String email, String password) {
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getButtonLogin().click();
	}
}
package meuprojeto.pages;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {
	
	@Test
	void testLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alans\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LoginAmazon page = new LoginAmazon(driver);

		page.getEmail().sendKeys("");
		page.getEmail().submit();
	}

}

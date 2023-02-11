package meuprojeto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends Page {
	
	public GoogleSearch(WebDriver driver) {
		super(driver);
		driver.get("http://www.google.com");
	}

	public WebElement getSearchInput() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}
}

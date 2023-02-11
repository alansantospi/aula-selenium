package meuprojeto.pages;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteGoogle {
	 private void pesquisarPor(final String stringPesquisa, WebDriver driver) {
		 
		 GoogleSearch page = new GoogleSearch(driver);
		 assertEquals("Google", page.getTitle());
         WebElement campoPesquisado = page.getSearchInput();
         campoPesquisado.clear();
         campoPesquisado.sendKeys(stringPesquisa);
         campoPesquisado.submit();
         assertTrue(page.getTitle().startsWith(stringPesquisa));
         
	 }
	 
	 @Test
     public void test_pesquisarPor_LetsCode_noChrome() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\alans\\Downloads\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
          pesquisarPor("LetsCode!", driver);
     }
	 
	 @Test
     public void test_pesquisarPor_LetsCode_noFirefoz() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\alans\\Downloads\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
          pesquisarPor("LetsCode!", driver);
     }
	 
//	 @Test
	 public void test_2(String stringPesquisa) {
		 WebDriver driver = new ChromeDriver();
		 (new WebDriverWait(driver, Duration.ofMillis(100))).until(new ExpectedCondition<Boolean>() {
	       public Boolean apply(WebDriver objDriver) {
	            return objDriver.getTitle().toLowerCase().startsWith(stringPesquisa.toLowerCase());
	       }
	    });
	 }
	 

}

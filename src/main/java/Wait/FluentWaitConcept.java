package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofMillis(2000))
//				.ignoring(NoSuchElementException.class);
//
//		wait.until(ExpectedConditions.presenceOfElementLocated(emailId)).sendKeys("naveen@gmail.com");
		
		
//		above wait can be achieved using webdriver wait
//		both wait are same
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
				wait.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(2000))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(emailId)).sendKeys("naveen@gmail.com");
		
		
		
	}

}

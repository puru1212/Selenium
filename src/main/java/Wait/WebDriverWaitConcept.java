package Wait;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		
		
		By emaillocator = By.id("input-email");
		By passLocator = By.id("input-password");
		
		By loginButtonLocator = By.xpath("//input[@value='Login']");
		
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']")); 
		
		wait.until(ExpectedConditions.presenceOfElementLocated(emaillocator));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
		
		
		
		
		driver.findElement(emaillocator).sendKeys("naveen@gmail.com");
		driver.findElement(passLocator).sendKeys("test123");
		//driver.findElement(loginButtonLocator).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		if(wait.until(ExpectedConditions.urlContains("/Register"))) {
			System.out.println(driver.getCurrentUrl());
		}
		






















		
		
		
	}

}

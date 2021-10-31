package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LocatorConcept_Puru {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// 1. x-path: -- priority 2
		// we should not use absolute x-path // //body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/input[1] 
		//we should only use relative xpath ////*[@id="Form_submitForm_Email"]
		

		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("Purushottam");
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_LastName\"]")).sendKeys("Dhadwe");

		// 1. id: -- priority 1
		
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("purushottamdhadwe@hotmail.com");
		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("Automation Engineer");
		
		// 3 name: -- priority 3
		
		driver.findElement(By.name("CompanyName")).sendKeys("Google");
		
		// 4. linktext: -- this is only for links
		
		//driver.findElement(By.linkText("Privacy Policy")).click();
		
		//5 cssselector -- priority 2
		
		driver.findElement(By.cssSelector("#Form_submitForm_Contact")).sendKeys("8087266888");
		
		// 6 partialLinkText -- not useful
		
		//driver.findElement(By.partialLinkText("cs")).click();
		
		// 7 class name -- -- priority 4
		
		driver.findElement(By.className("labeledtext")).sendKeys("test");
		
	}

}

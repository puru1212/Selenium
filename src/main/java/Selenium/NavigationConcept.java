package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.in/");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}

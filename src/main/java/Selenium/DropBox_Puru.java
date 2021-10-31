package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropBox_Puru {
	
	static WebElement ele;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&path=18");
		driver.getTitle();
		
		
		//By locator = By.id("input-sort");
		By locator = By.id("input-limit");
		
		ele = driver.findElement(locator);
		
		selectElement(ele);
		
	
	}

	public static void selectElement(WebElement ele) {
		
		Select select = new Select(ele);
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size());
		
		for (WebElement e : optionList) {
			String allOptions= e.getText();
			System.out.println(allOptions);
			
		}
		
		

	}
}

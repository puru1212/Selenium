package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(2000);
		
		List <WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span"));
		
		System.out.println(suggList.size());
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("naveen automation labs udemy")) {
				e.click();
				break;
			}
		}
		
	}

}

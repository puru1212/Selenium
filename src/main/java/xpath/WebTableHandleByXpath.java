package xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandleByXpath {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.espncricinfo.com/series/india-tour-of-sri-lanka-2021-1262739/sri-lanka-vs-india-2nd-odi-1262756/full-scorecard");

		
			
			List<WebElement> scoreCard = driver.findElements(By.xpath("//a[text()='Avishka Fernando']//parent::td//following-sibling::td"));
			
			
			for(WebElement e : scoreCard) {
			String scoreText = e.getText();
			
			System.out.print(scoreText);
			
		
			}
			
			
		
		
	}

}

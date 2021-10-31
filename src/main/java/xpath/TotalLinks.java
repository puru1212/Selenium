package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://amazon.com");
		
		List <WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement e : allLinks) {
			String linkNames = e.getText();
			if(!linkNames.isBlank()) {
			System.out.println(linkNames);
			}
		}
		
		
	}

}

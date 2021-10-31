package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://amazon.com");
		List <WebElement> imgList = driver.findElements(By.tagName("img"));
		
		
		for(WebElement e : imgList) {
			String altAtt = e.getAttribute("alt");
			String srcAtt = e.getAttribute("src");
			System.out.println(altAtt+"--->" +srcAtt);
		}
		
	}

}

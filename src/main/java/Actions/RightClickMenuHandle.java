package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickMenuHandle {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
			WebElement rightClikEle = driver.findElement(By.xpath("//span[text()='right click me']"));
			Thread.sleep(3000);
			
			
			Actions act = new Actions(driver);
			
			act.contextClick(rightClikEle).build().perform();
			
			List <WebElement> rightOptions = driver.findElements(By.xpath("//li[contains(@class,'context-menu-item context-menu-icon')]/span"));
			
			System.out.println(rightOptions.size());
			
			for (WebElement e : rightOptions) {
				String options = e.getText();
				System.out.println(options);
				
				if(options.equals("Delete")) {
					e.click();
					break;
				}
				
				
			}

	}

}

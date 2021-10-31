package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


// to click on all the check box of contact page

public class Assignment_Xpath {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		
		List<WebElement> checkBoxOptions = driver.findElements(By.xpath("//td[@class='datalistrow']//input[@type='checkbox' and @name='contact_id']"));
		
		for(WebElement e : checkBoxOptions) {
			e.click();
		}
		
		
		
		
	}

}

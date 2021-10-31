package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		
		Actions act = new Actions (driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		Thread.sleep(2000);
			
		driver.findElement(By.linkText("Member Login")).click();
		

		
		
		
	}

}

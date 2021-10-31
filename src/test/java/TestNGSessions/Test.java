package TestNGSessions;



import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Testing");
		
		Actions act = new Actions(driver);
		
//		act.keyDown(Keys.ENTER).perform();
//		act.keyUp(Keys.ENTER).perform();
//		
		Thread.sleep(5000);
		
		List<WebElement> optionList = driver.findElements(By.xpath("//li[@class='sbct']//span"));
		
		for(WebElement w : optionList) {
			System.out.println(w.getText());
		}
		
		optionList.get(2).click();
		
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

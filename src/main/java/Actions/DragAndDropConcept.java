package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		WebElement targetEle = driver.findElement(By.id("draggable"));
		WebElement sourceEle = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions (driver);
		//act.clickAndHold(targetEle).moveToElement(sourceEle).release().build().perform();
		
		
		act.dragAndDrop(targetEle, sourceEle).perform();
		
	}

}

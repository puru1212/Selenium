package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Pagination {

	static WebDriver driver;

	public static void selectContact(String name) {
		String checkBox = "//a[text()='" + name + "']//parent::td//preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkBox)).click();
	}

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

		List<WebElement> pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

		int i = 0;
		while (true) {

			if (driver.findElements(By.linkText("Virat Kolhi")).size() > 0) {
				selectContact("Virat Kolhi");
				break;

			} else {
				// pagination
				try {
					pages.get(i).click();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("pagination is over....and we dint find any contact....");
					break;
				}
				pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

			}
		}
		i++;

	}

}

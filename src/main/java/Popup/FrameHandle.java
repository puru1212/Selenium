package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		
		// to find the number of frames on webpage
		List <WebElement> frameList = driver.findElements(By.tagName("frame"));
		System.out.println(frameList.size());
		System.out.println(frameList.get(2));
		
		
		driver.switchTo().frame(2);
//		driver.switchTo().frame("main");
//		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
	
		driver.switchTo().defaultContent();
				
		

	}

}

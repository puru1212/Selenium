package Popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {

		// browser window pop up/new tab window/new browser window

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("--------------------------");
		System.out.println(handles);
		System.out.println("--------------------------");
		Iterator <String> it = handles.iterator();
//		while(it.hasNext()) {
//			
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getCurrentUrl());
//			System.out.println(driver.getTitle());
//			driver.close();
//		}
		

		
		
		List<String> handlesList = new ArrayList <String> (handles);
		System.out.println("--------------------------");
		System.out.println(handlesList.size());
		handlesList.stream().forEach((i)->System.out.println(i));
		System.out.println("--------------------------");

		for (int i = 1; i<handlesList.size(); i++) {
			
			System.out.println(handlesList.get(i));
			
			driver.switchTo().window(handlesList.get(i));
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
		}
		

	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackGroundColor {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String bckColor = driver.findElement(By.xpath("//a[text()='Get a Free Demo']")).getCssValue("background-color");
		
		System.out.println(bckColor);
		String color = Color.fromString(bckColor).asHex();
		System.out.println(color);
		
		
		
		
	}

}

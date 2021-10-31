package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions eo = new EdgeOptions();
//		eo.setCapability("In Private", true);
//		WebDriver driver = new EdgeDriver(eo);
		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		//co.addArguments("--incognito");
//		co.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(co);

		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		System.out.println(driver.getTitle());
		
	}

}

package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		takeScreenshot("homePage");
	}
	
	
	public static void takeScreenshot(String filename) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Pdhadwe\\eclipse-workspace\\MySeleniumSession"
				+ "\\src\\main\\java\\ScreenShot\\ScreenShot" + filename + ".jpg"));
		
		
		
		
		
		
	}

}

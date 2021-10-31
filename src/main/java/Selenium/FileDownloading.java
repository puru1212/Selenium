package Selenium;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloading {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0); // to hide the pop up
		prefs.put("download.default_directory", "F:\\Puru P\\Soft_Eclips\\Ecli_Download"); // to give the path for download
		prefs.put("plugins.always_open_pdf_externally", true);

		option.setExperimentalOption("prefs", prefs);
		
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		
		String fileType = "PDF";
		
		driver.findElement(By.xpath("//h3[text()='Documents']//following-sibling::a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
		
		
		
	}

}

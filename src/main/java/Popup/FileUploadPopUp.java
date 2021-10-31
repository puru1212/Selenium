package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		By locator = By.xpath("//input[@name='upfile']");
		driver.findElement(locator).sendKeys("C:\\Users\\Pdhadwe\\Downloads\\कडक निर्बंध आदेश बुलडाणा  जिल्हा दि.9.5.21 (1).pdf");
		
		//in html dom we must have type="file" to use above method
		
	}

}

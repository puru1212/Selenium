package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsPopUpHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mypage.rediff.com/login/dologin");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
//		alert.dismiss();
//		alert.sendKeys("test");
				
		driver.switchTo().defaultContent();
		
		
		

	
	}

}

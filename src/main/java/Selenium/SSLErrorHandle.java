package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLErrorHandle {

	public static void main(String[] args) {

		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://expired.badssl.com/");
	}

}

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

		public WebDriver driver;

		public WebDriver launchBrowser(String browserName) {

			if (browserName.equals("chrome")) {
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pdhadwe\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equals("firefox")) {
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pdhadwe\\geckodriver-v0.29.1-win64\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}else {
				System.out.println("please pass the correct browser....");
			}

			return driver;
		}
		
		public void launchUrl(String url) {
			if (url == null) {
				return;
			}
			if (url.isEmpty()) {
				return;
			}
			driver.get(url);
		}

		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public String getPageUrl() {
			return driver.getCurrentUrl();
		}

		public String getCurrentPageSource() {
			return driver.getPageSource();
		}

		public void closeBrowser() {
			driver.close();
		}

		public void quitBrowser() {
			driver.quit();
		}

	
}

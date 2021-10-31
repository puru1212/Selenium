package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTraverse {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// table[@id='customers']//tr[2]//td[1]
		// table[@id='customers']//tr[3]//td[1]
		// table[@id='customers']//tr[4]//td[1]
		// table[@id='customers']//tr[5]//td[1]
		// table[@id='customers']//tr[6]//td[1]
		// table[@id='customers']//tr[7]//td[1]

//		String before_xpath = "//table[@id=\"customers\"]/tbody/tr[";
//		String middle_xpath = "]/td[";
//		String after_xpath = "]";
//
//		int rowCount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//
//		for (int j = 1; j <= 3; j++) {
//			for (int i = 2; i <= rowCount; i++) {
//				String compXpath = before_xpath + i + middle_xpath + j + after_xpath;
//				// System.out.println(compXpath);
//				String compVal = driver.findElement(By.xpath(compXpath)).getText();
//				System.out.println(compVal);
//
//			}
//			System.out.println();
//
//		}
		
		String before_xpath = "//table[@id='customers']//tr[";
		String after_xpath = "]";
		
		
		int rowCount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		
		for (int i = 2; i <= rowCount; i++) {
			String compXpath = before_xpath + i + after_xpath;
			String comRow = driver.findElement(By.xpath(compXpath)).getText();
			System.out.println(comRow);
		}
			
		
		
		
		
	}

}

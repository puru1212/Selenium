package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Thread.sleep(2000);

		By locator = By.cssSelector(".comboTreeItemTitle");
//		choiceSelect(locator, "choice 2 2");
//		choiceSelect(locator, "choice 2 3");
//		choiceSelect(locator, "choice 2 2", "choice 2 3", "choice 3", "choice 4", "choice 5", "choice 6", "choice 7","choice 6 2 1");
//		choiceSelect(locator, "select_all");

//		without generic method we can select a choice as below

//		List<WebElement> choiceList = driver.findElements(By.cssSelector(".comboTreeItemTitle"));
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		System.out.println(choiceList.size());

		for (WebElement e : choiceList) {
			String text = e.getText();
			System.out.println(text);
//			if (text.equals("choice 2 2")) {
//				e.click();
//				break;
//			}
		}

	}

	public static void choiceSelect(By locator, String... value) {

		List<WebElement> optionList = driver.findElements(locator);

		if (!value[0].equals("select_all")) {

			for (WebElement w : optionList) {
				String text = w.getText();
				System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						w.click();
						break;
					}
				}

			}
		} else {
			try {
				for (WebElement e : optionList) {
					e.click();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

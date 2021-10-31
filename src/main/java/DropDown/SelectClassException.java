package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassException {

	public static void main(String[] args) {

		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement choice = driver.findElement(By.id("justAnInputBox"));
		Select select = new Select(choice);
		select.selectByIndex(2); //UnexpectedTagNameException: Element should have been "select" but was "input"
		
	}

}

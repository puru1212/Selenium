package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		
		//driver.findElement(By.id("Form_submitForm_NoOfEmployees")).sendKeys("26 - 50");
		
		Select select = new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
		//select.selectByValue("26 - 50");
		//select.selectByVisibleText("26 - 50");
		//select.selectByIndex(5);
		driver.findElement(By.id("Form_submitForm_NoOfEmployees")).sendKeys("1,001 - 1,500");
		
		List<WebElement> optionList = select.getOptions();
		
		for(WebElement e : optionList) {
			System.out.println(e.getText());
		}
		
		
		
		
		
	}

}

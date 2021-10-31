package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithOutSelect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		
		List <WebElement> optionList = driver.findElements(By.xpath("//*[@id=\"Form_submitForm_Industry\"]/option"));
		System.out.println(optionList.size());
		
		for(WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("Education")) {
				e.click();
				break;
			}
		}
		
		
		
	
		
		
	}

}

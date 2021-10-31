package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendKeysAndClick {
	
	static WebDriver driver;
	
	//some times due to random pop up or not focus element or some overlapped elements we may not be able 
	//to click on element by regular Webelement.click method or Webelement.sendkey
	// to overcome this issue we can use actions send key and click
	
	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailID = By.xpath("//input[@id='input-email']");
		By password = By.xpath("//input[@id='input-password']");
		By loginButton = By.xpath("//input[@value='Login']");
		
		Actions act = new Actions (driver);
		
		act.sendKeys(driver.findElement(emailID), "naveenanimation20@gmail.com");
		act.sendKeys(driver.findElement(password), "Selenium12345");
		
		act.click(driver.findElement(loginButton)).build().perform();
		
		
		
		
		

	}

}

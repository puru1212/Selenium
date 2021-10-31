package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement emailId = driver.findElement(By.id("input-email"));//10 - 3 secs --> 7 secs
		WebElement password = driver.findElement(By.id("input-password"));//10 -- 0 sec
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));//10

		emailId.sendKeys("naveenanimation20@gmail.com");
		password.sendKeys("naveenanimation20@gmail.com");
		loginBtn.click();
		
		//home page: 5 secs
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//e4
		//e5
		//e6
		
		//logout:
		//login page: 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//register page: 15 secs
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//forgot pwd page: 0 secs --nullify of imp wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//e7 -- 0 sec
		//e8 -- 0 sec
		
		
		//js confirmation pop up (alert)-- 5 secs
	}

}

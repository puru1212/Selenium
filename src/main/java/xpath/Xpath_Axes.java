package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		
		//parent to child:
			
			//direct child: /
			//indirect + direct child: // 
			//htmltag[@attribute='']//child::input[@attribute='']
		
			//div[@class='private-form__input-wrapper']//child::input[@id='username']
			//select[@id='Form_submitForm_Industry']//option
			
			//child to parent: backward traversing
			//input[@id='username']/../../../../../../../../../..
			//input[@id='username']//parent::div
			//input[@id='input-email']//parent::div --> immediate parent
			//input[@id='input-email']//ancestor::div -- all parents
		
		//sibling traversing:
				//	preceding-sibling
				//	following-sibling
		
		
		//(for example: https://classic.freecrm.com/index.cfm?CFID=603784&CFTOKEN=60fb4bde63408055
//															-816D6794-B6EC-7BE8-7C9139C43BEC6CC5&jsessionid=a630487cc7272a6fb84d5714e10784234145
		//we need to click on all the check box...
		
				//a[text()='Aastha Grover']//parent::td//preceding-sibling::td/input[@type='checkbox']
				//a[text()='AB Devilliers']//parent::td//preceding-sibling::td/input[@type='checkbox']
				//a[text()='Akshay patil']//parent::td//preceding-sibling::td/input[@type='checkbox']
		
		//we want to collect the compay name
				//a[text()='Aastha Grover']//parent::td//following-sibling::td/a[@context='company']
		
		

	}

}

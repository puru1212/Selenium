package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title").toString(); // to get the title of the browser
//		System.out.println(title);
		
		
//		js.executeScript("history.go(0)"); // To Refresh Browser 
//		js.executeScript("alert(' hi this is my alert')");
		
//		String allText = js.executeScript("return document.documentElement.innerText").toString(); // To get all the element text on page  
//		System.out.println(allText);
		
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // to scroll down
//		Thread.sleep(4000);
//		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)"); // to scroll up
		
		
		
		String xpath = "//h2[text()='Get fit at home']";
		WebElement element = driver.findElement(By.xpath(xpath));
		
		js.executeScript("arguments[0].scrollIntoView(true)", element ); // scroll to specific element
		js.executeScript("arguments[0].style.border='3px solid red'", element); // draw border to specific element
		
		
	}

}




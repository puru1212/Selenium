package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandling {

	static WebDriver driver;

	public static void selectFutuerDay(String expMonYr, String day) {
		
		if(Integer.parseInt(day)>31 || Integer.parseInt(day)<1) {
			System.out.println("please pass the valid day");
			return;
		}

		String actMonYr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actMonYr);
		while (!actMonYr.equals(expMonYr)) {
			// click next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonYr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		try {
			driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
			}
		catch(Exception e) {
			System.out.println("Invalid day of the : "+ expMonYr+" Please pass a valid date for the respective month");
			}
	}

	public static void selectPastDay(String expMonYr, String day) {
		
		if(Integer.parseInt(day)>31 || Integer.parseInt(day)<1) {
			System.out.println("please pass the valid day");
			return;
		}
		
		String actMonYr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actMonYr);
		while(!actMonYr.equals(expMonYr)) {
			//click previous
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonYr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		try {
			driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
			}
		catch(Exception e) {
				System.out.println("Invalid day of the : "+ expMonYr+" Please pass a valid date for the respective month");
			}
	}
			
			
			

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);

//		selectFutuerDay("September 2021", "31");

		selectPastDay("June 2020", "31");
		
//		//driver.findElement(By.xpath("//a[text()='9']")).click();
//		List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
//		
//		for(WebElement e : dayList) {
//			if(e.getText().equals("9")) {
//				e.click();
//			}
//		}

	}

}

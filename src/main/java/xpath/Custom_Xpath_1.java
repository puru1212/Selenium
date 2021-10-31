package xpath;

import org.openqa.selenium.By;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		// x-path -> address of the element in HTML DOM.

		// 1. absolute x-path: /html/body/div/div[1]/div[2]/div[3]/ul/li/[3]/a
		// 2. relative x-path(custom): by using html tag and attributes + functions + x-path axis

		// formula: //htmltag[@attribute='value']

			//	htmltag[@attr = 'value']
			//	input[@id='input-email']
			//	input[@name='email']

		//a --> we can use it to Find Elements using xpath -- total links 
		
		//And
			//	 htmltag[@attr1 = 'value' and @attr2 = 'value']
			//	 input[@name='email' and @type='text']
			//	 input[@value='Login' and @type='submit']

		//Or
			//	 input[@type='text' or @type='email']
				
		// index:
		    //	(//input[@class='form-control'])[1]
		    //	(//input[@class='form-control'])[position()=1]
		    //	(//input[@class='form-control'])[last()]
		
		//xpath with text():
			//htmltag[text()='value']
			//a[text()='Login']
			//h2[text()='Refreshing business software that your teams will love']
			//h3[text()='Marketing Campaigns']
			//span[text()=' sign up']
		
		
		//contains():
				//htmltag[contains(@attr,'value')]
				//input[contains(@id,'email')]
		
		
		//dynamic elements with dynamic attributes
			//<input id = "firstname_123">
			//<input id = "firstname_234">
			//<input id = "firstname_456">

			//input[contains(@id,'firstname_')]
		
		
		///contains() with text():
				//htmltag[contains(text(),'value')]
				//a[contains(text(),'Order')]
				//h2[contains(text(),'business software')]
				
			//contains with one attr and second attrr without contains:
			
				//htmltag[contains(@attr1,'value') and @attr2='value']
				//input[contains(@id,'email') and @type='text']
				//input[contains(@id,'email') and @type='text' and contains(@name,'email')]
				
			//contains() with text() and attributes:
				//htmltag[contains(text(),'value') and @attr='value']
				//a[contains(text(),'Contact Sales') and @href='/contact-sales/']
			
			//contains() with text() and contains with attributes:
				//a[contains(text(),'Contact Sales') and contains(@class,'btn-orange')]
		
		
		//starts-with:
				//	h2[starts-with(text(),'Refreshing')]
				//	dynamic elements with dynamic attributes
		
				//	<input id = "firstname_123">
				//	<input id = "firstname_234">
				//	<input id = "firstname_456">
				//	input[starts-with(@id,'firstname_')]
		
		
		//star vs input html tag
				//*[@type='text'] -- 3
				//input[@type='text'] -- 3
		
		
		//with className method - can not use multiple classes together...
		By.className("form-control private-form__control login-email"); //wrong
		
		By.xpath("//input[@class='form-control private-form__control login-email']");//correct
		By.cssSelector(".form-control.private-form__control.login-email");//correct
		By.className("login-email"); //correct
		
		
		
		
	}

}

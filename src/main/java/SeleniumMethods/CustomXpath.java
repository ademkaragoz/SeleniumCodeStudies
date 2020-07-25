package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {
		
		// Xpath is used to find any location of element on a web page using Html structure
		// Absolute Xpath: starts single slash (/) starting from root element and all 
		// the way to the element
		//Relative Xpath:  starts with double slash (//) starting selection matching 
		// anywhere in the document
		
		// Absolute Xpath:   html/body/div/div[5]/div[2]/i/div[1]/a
		// Relative Xpath:    //tagName[@attribute='value']
		
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//input[@id='username'] --> username
		//input[@id='password'] --> password
		//button[@id='loginBtn'] --> loginBtn
		
		//input[@name='username']
		//input[@name='password']
		
		//Contains()
		//input[contains(@name, 'username')]
		//input[contains(@name, 'password')]
		//input[@class= 'btn btn-small' and @value='Login']
		
		// Dynamic xpath
		//<input id=TestAcceptor1 123>
		// sample //input[contains(@id, 'test_')]
		// Contains is used to for or dynamic elements properties
		
     	//text function
		//tagName[text()='Sign up']
		//i18n-string[text()= 'Sign up']
		//a/i18n-string[text()= 'Sign up']
		//a/i18n-string[text()= 'Privacy Policy']
		//h5[text()]
		
		//start-with function
		//input[start-with(@id, 'username')]
		
		//ends-with function
		//<input id=test_123>
		//<input id= 123_text>
		
		
		    //position  --> means index number
	//  	(//input[contains(@class, 'form-control')])[1]  --> username
    //      (//input[contains(@class, 'form-control')])[2]  --> password
	//      (//input[contains(@class, 'form-control')])[position()=1] 	
	//      (//input[contains(@class, 'form-control')])[position()=2] 	
		
	// parent and child tags in html
	//div[contains(@class, 'private-form__input-wrapper')]/input[@id='username'] --> direct child	
    //div[contains(@class, 'private-form__input-wrapper')]/input[@id='password'] --> direct child
		
	
	//following ::
		//div[@class='private-form__input-wrapper']//following::input[@id='password']
		//div[@class='private-form__input-wrapper']//following::input[@id='remember']
		
		
	//preceding::	
		//input[@id='password']/preceding::div[@class='private-form__control-wrapper']
		//input[@id='username']/preceding::div[@class='private-form__control-wrapper']
		
	//child to parent (reverse direction)	
		//input[@name='username']/../../../../../..
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div//parent::form
		
		//last()
		//      (//input[@type='text'])[last()]
		
		
		//ancestor
		//input[@id='uid-firstName-5']//ancestor::body
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

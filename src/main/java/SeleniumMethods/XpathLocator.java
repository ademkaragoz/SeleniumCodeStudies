package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Xpath is used to find location of element on the web page using HTML structure (XML)
		//Absolute (/), Relative(//)
		//  /html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]/input[1]
		//  //input[@id='username']
		
		// //tagName[@attributeName='value']
		
		// top open customize bar command+f
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://app.hubspot.com/login");
	    Thread.sleep(5000);
		
//		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("adem@gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("123tezt@");

		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		
		ElementUtil.getElement(driver, username).sendKeys("Semih@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("123@");
		
		
		
		
		
		
		
	}

}

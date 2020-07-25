package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorLacotor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://app.hubspot.com/login");
	    Thread.sleep(5000);
	    
	    By username = By.cssSelector("#username");
	    ElementUtil.getElement(driver, username).sendKeys("talha@gmail.com");
	    By password = By.cssSelector("#password");
	    ElementUtil.getElement(driver, password).sendKeys("1353@");
	    By loginBtn = By.cssSelector("#loginBtn");
	    ElementUtil.clickOn(driver, loginBtn);
		
		
	}

}

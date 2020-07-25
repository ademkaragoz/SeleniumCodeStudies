package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementUtil {
	
	/**
	 * 
	 * This method is used to handle alert
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	/**
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}
	/**
	 * 
	 * @param driver
	 * @param browsersName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browsersName) {
		if(browsersName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browsersName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/Drivers/chromedriver");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Browser is not avaible: "+ browsersName);
		}
		return driver;
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	/**
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	/**
	 * 
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	
	
}

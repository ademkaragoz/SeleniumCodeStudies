package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackAndForward {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wwww.google.com");  // google
		
		driver.navigate().to("https://amazon.com");  // amazon
		Thread.sleep(2000);  // MS == 2 seconds
		
		driver.navigate().back();  // google
		Thread.sleep(2000);
		driver.navigate().forward();  // amazon
		Thread.sleep(2000); 
		driver.navigate().back();  // google
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.quit();
		
		
		// Get and Navigate
		
		// get navigates to webpage. Webdriver will wait until the page has fully loaded
		// before returning control script. Get function does not have any method
		
		// Navigate navigates URL. Webdriver will not wait the page has fully loaded 
		// Navigate function has some methods like back forward refresh
		
		
		
		
		
		
		
		
		
	}

}

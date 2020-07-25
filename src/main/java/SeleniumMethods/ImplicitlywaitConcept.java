package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlywaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		//This wait tells webdriver to wait if the element is not available immediately and
		// webdriver waits till the element is visible in specific time 
		//NoSuchElementException
		//Imp wait works only element - does not work with non-element
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title is ::" + driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

}

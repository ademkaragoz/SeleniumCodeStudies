package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicWithChrome {

	public static void main(String[] args) {
		
		// Set property
		
		System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/Drivers/chromedriver");
		
		// Set browser
		
		WebDriver driver = new ChromeDriver();
		
		// launch browser
		driver.get("https://learn.siliconelabs.com/");
		
		// get title
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Best Certified SDET Traning program - SiliconeLabs")) {
		System.out.println("Title is correct");
		}else {
			System.out.println("Title is not correct");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://learn.siliconelabs.com/")) {
			System.out.println("URL is correct");
			
		}else {
			System.out.println("URL is not correct");
		}
		
		//driver.close();   //closes current browser
		driver.quit();      //close all browser
		
		
		

	}

}

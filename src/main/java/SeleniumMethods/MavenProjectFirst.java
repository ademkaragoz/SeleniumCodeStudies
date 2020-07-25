package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenProjectFirst {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");    // google
		
		driver.navigate().to("https://learnsdet.com/");  // learnsdet
		Thread.sleep(2000);   // means two seconds
		
		driver.navigate().back();      // google
		Thread.sleep(2000);
		driver.navigate().forward();   // learnsdet
		Thread.sleep(2000);
		driver.navigate().back();      // google
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
		
		

	}

}

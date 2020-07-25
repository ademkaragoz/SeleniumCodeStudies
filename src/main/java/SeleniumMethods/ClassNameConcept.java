package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
		
		By username = By.className("login-email");
		ElementUtil.getElement(driver, username).sendKeys("talha23@gmail.com");
		
		
		
		
	}

}

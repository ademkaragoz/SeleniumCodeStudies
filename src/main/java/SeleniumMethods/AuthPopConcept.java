package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		
	}

}

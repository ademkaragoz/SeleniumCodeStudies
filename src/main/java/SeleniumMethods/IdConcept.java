package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize web page
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//ID
		
	   //First Usage
//	WebElement userElement = driver.findElement(By.id("username"));
//		userElement.sendKeys("boblerry@gmail.com");
//		WebElement userPass = driver.findElement(By.id("password"));
//		userPass.sendKeys("test234@");
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		loginBtn.click();
//		
		//Second Usage
//		driver.findElement(By.id("username")).sendKeys("adem@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123@4");
//		driver.findElement(By.id("loginBtn")).click();
	
//		Third Usage
		By username = By.id("username");
    	By password = By.id("password");
		By loginBtn = By.id("loginBtn");
//		
//		WebElement userElement = driver.findElement(username);
//		userElement.sendKeys("adem@gmail.com");
//		WebElement userPass = driver.findElement(password);
//		userPass.sendKeys("test@345");
//		WebElement loginBtn = driver.findElement(loginBtn);
		
		//Fourth Approach
		ElementUtil.getElement(driver, username).sendKeys("adem@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test123@");
		ElementUtil.getElement(driver, loginBtn).click();
	
		
		

	}

}







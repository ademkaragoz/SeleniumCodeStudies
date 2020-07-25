package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		
		Thread.sleep(3000);
		
		//Name
		
		//first Usage
//		WebElement userElement = driver.findElement(By.name("username"));
//		userElement.sendKeys("adem@gmail.com");
//		WebElement passElement = driver.findElement(By.name("password"));
//		passElement.sendKeys("1234@1");
		
		//Second Usage
//		driver.findElement(By.name("username")).sendKeys("adem@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("1234@1");
//		driver.findElement(By.xpath("//button[@class='radius']/i")).click();
		
		//Third Usage
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//button[@class='radius']/i");
		
//		WebElement userElement = driver.findElement(username);
//	    userElement.sendKeys("silicone@gmail.com");
//		WebElement passElement = driver.findElement(password);
//		passElement.sendKeys("password");
//		WebElement loginBtn = driver.findElement(login);
//		loginBtn.click();
		
		//Fourth Approach
		
		ElementUtil.getElement(driver, username).sendKeys("semih@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("1234@3");
		ElementUtil.clickOn(driver, login);
		
	
		
		

		

	}

}

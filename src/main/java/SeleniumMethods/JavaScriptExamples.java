package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExamples {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		//driver.manage().window().fullscreen();
		Thread.sleep(5000);
		
		
		//System.out.println(JavaScriptUtil.getTitleByJS(driver));
		
		//JavaScriptUtil.scrollPageDown(driver);
		
		//JavaScriptUtil.specificScrollPageDown(driver);
		
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));

		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		//JavaScriptUtil.clickElementByJS(signupLink, driver);
		//JavaScriptUtil.drawBorder(signupLink, driver);
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
//		JavaScriptUtil.flash(email, driver);
//		email.sendKeys("adem@gamil.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("test123");
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();
		//JavaScriptUtil.generateAlert(driver, "Please tester get warning  from the page");
		
		String browserInfo = JavaScriptUtil.getBrowserInfo(driver);
		System.out.println(browserInfo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown_3 {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			
			driver.findElement(By.id("justAnInputBox")).click();

	}

}

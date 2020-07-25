package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");

		// getWindowHandle() == get the current window handling 
		//getWindowHanles == get the window handles that opened
		//swicthTo().window
		
		driver.findElement(By.className("black")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window is: " + parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child window is: " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Chil window title is: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is: " + driver.getTitle());
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}

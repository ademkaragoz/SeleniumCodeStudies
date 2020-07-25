package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandiling3 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		//URL
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		//Locator
		By goBtn = By.name("proceed");
		
		//launch browser
		driver = ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, url);
		System.out.println(ElementUtil.getPageTitle(driver));
		ElementUtil.clickOn(driver, goBtn);
		
		Thread.sleep(4000);
		
		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Text is correct");
		}else {
			System.out.println("Text is incorrect");
		}
		
		ElementUtil.quitBrowser(driver);
	}

}

package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		
		List<WebElement> rows = driver.findElements(By.id("//*[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in web table: " + rowCount);
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/th[1]";
		
		for(int i = 2; i<rowCount; i++ ) {
			String actualXpath = beforeXpath + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading")) {
				System.out.println("company name: "+ element.getText()+ "is found "+ "at position "+ (i-1));
				break;
			}
			
			
		}
		
		
		
		
		

	}

}

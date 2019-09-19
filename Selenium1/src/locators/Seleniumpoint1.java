package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpoint1 {
	
		public static void main(String[] agrs){
		//public void locators(){
		
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpoint.com");
		System.out.println("website loaded successfully");
		/*driver.findElement(By.id("name")).sendKeysss("name1");
		driver.findElement(By.name("umobile")).sendKeys("12345");
	
		*/
	}		
	}

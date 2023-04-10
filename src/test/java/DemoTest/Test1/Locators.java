package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //  Launch Chrome web Browser
	    System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		// Basic Locators
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Switch to product page 
		/*
		 * String currWindowHandle = driver.getWindowHandle();
		 * driver.switchTo().window(currWindowHandle);
		 * driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		 */
		 
		List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element size: " + elementList.size());
				
	}

}

package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //  Launch Chrome web Browser
	    System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.saucedemo.com/");
		
		// Xpath (Customized Locators)
		/*
		 * // Locate username by - Single attribute
		 * driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(
		 * "standard_user");
		 * 
		 * // Locate passsword by - multiple attribute
		 * driver.findElement(By.xpath("//*[@id='password'][@name='password']")).
		 * sendKeys("secret_sauce");
		 * 
		 * //Locate login button
		 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 * 
		 * // Switch to product page String currentWindowHandle =
		 * driver.getWindowHandle(); driver.switchTo().window(currentWindowHandle);
		 * 
		 * //Add to cart using and $ or operator driver.findElement(By.
		 * xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']"
		 * )).click(); driver.findElement(By.
		 * xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @id='add-to-cart-sauce-labs-bike-light']"
		 * )).click();
		 * 
		 * // Locate username using - contains
		 * driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys(
		 * "standard_user");
		 * 
		 * // Locate password using - starts with
		 * driver.findElement(By.xpath("//*[starts-with(@id,'password')]")).sendKeys(
		 * "secret_sauce");
		 */
		
		// For position and last method 
		driver.get("http://only-testing-blog.blogspot.com/");
		driver.findElement(By.xpath("//input[@type='text'][position()=1]")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("Pakku");
				
	}

}

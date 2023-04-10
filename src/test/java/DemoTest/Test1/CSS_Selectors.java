package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //  Launch Chrome web Browser
	    System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//CSS Selector (Customized Locators)
		// Locate user name by - tag#Id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		// Locate password by - tag[attribute=value]
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("secret_sauce");
		
		// locate login button using tag.value of class name
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//Switch to product page
		String currentWindowHandle = driver.getWindowHandle(); 
		driver.switchTo().window(currentWindowHandle);
		
		//tag.valueClass[attribute-value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		// tag[attributes=substring]
		driver.findElement(By.cssSelector("button[name^=add]")).click(); //starts with = ^
		driver.findElement(By.cssSelector("button[name$=light]")).click(); //ends with = $
		driver.findElement(By.cssSelector("button[name*=bike]")).click(); // contains = *
		
	}

}

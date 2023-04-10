package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		Actions actions = new Actions(driver);
		Action seriesOfActions = actions
				.moveToElement(driver.findElement(By.id("user-name")))
		        .click()
		        .sendKeys("standard_user", Keys.TAB)
		        .sendKeys("secret_sauce", Keys.ENTER).build();
		
		seriesOfActions.perform();
		
		driver.quit();
	}

}

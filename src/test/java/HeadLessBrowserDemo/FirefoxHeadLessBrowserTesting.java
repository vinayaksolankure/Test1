package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadLessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions(); 
		options.addArguments("--remote-allow-origins=*");
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title Before Search: " + driver.getTitle());
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);
		
		System.out.println("Title After Search: " + driver.getTitle());
		
		driver.quit();
	}

}

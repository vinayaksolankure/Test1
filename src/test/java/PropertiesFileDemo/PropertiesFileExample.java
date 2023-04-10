package PropertiesFileDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		ReadConfigFile configFile = new ReadConfigFile();
		
		
		driver.get(configFile.getBaseUrl());
		
		driver.findElement(By.id("user-name")).sendKeys(configFile.getUsername());
		driver.findElement(By.id("password")).sendKeys(configFile.getPassword());
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Logged In SuccesFully....");
		
		//driver.quit();
	}

}

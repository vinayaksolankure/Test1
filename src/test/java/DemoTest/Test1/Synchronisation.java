package DemoTest.Test1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Synchronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		// Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Stopwatch watch = null;
//		try
//		{
//			watch = Stopwatch.createStarted();  // Time started
//		driver.findElement(By.linkText("START SELLING")).click();
//		}
//		catch(Exception e)
//		{
//			watch.stop(); // time stopped 
//			System.out.println(e);
//			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds ");
//		}
//		driver.close();
		
		// Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		Stopwatch watch = null;
//		try
//		{
//			watch = Stopwatch.createStarted();  // Time started
//			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("gfvdfshbgkbfdkjbgkj")));  // it is checking true or false if true then it returns webelement
//			element.click();
//		    //driver.findElement(By.linkText("START SELLING")).click();
//		}
//		catch(Exception e)
//		{
//			watch.stop(); // time stopped 
//			System.out.println(e);
//			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds ");
//		}
		
		
		// Fluent wait
        Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofSeconds(2))
        		.withMessage("This is custom message.")
        		.ignoring(NoSuchElementException.class);
        
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));  // it is checking true or false if true then it returns webelement
		element.click();

	}

}

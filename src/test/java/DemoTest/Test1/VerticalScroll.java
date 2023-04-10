package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		// scroll vertically down by 500 pixels 
		//js.executeScript("window.scrollBy(0,500)"); 
		
		//Scroll till visibility of webElement 
//		WebElement element = driver.findElement(By.linkText("BMI Calculator")); 
//		js.executeScript("arguments[0].scrollIntoView()",element);
		
		// To scroll down the web page at the bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}

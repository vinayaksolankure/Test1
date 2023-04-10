package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// find the alert button and click
//		driver.findElement(By.xpath("//*[@onclick='jsAlert()'][contains(text(),'Click for JS Alert')]")).click();
//		// Switch to alert window accept the popup
//		driver.switchTo().alert().accept();  // OK button is clicked
//		
		
		// find the confirm button and click
//		driver.findElement(By.xpath("//*[@onclick='jsConfirm()'][contains(text(),'Click for JS Confirm')]")).click();
//		//Switch to Confirm window accept the popup
//		//driver.switchTo().alert().accept();  // OK button is clicked
//		driver.switchTo().alert().dismiss();  // Cancel button is clicked
		
		// find the Prompt button and click
		driver.findElement(By.xpath("//*[@onclick='jsPrompt()'][contains(text(),'Click for JS Prompt')]")).click();
		//Switch to Prompt window accept the popup
		driver.switchTo().alert().sendKeys("Sourabh");
		driver.switchTo().alert().accept();  // OK button is clicked
		//driver.switchTo().alert().dismiss();  // Cancel button is clicked
		
	}

}

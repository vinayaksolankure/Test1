package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //  Launch Chrome web Browser
	    System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		//Launch the google web page
		driver.navigate().to("http://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9284196683");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vaibhav@9284");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Mobile");

	}

}

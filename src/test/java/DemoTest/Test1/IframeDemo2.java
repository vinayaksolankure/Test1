package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Launch Chrome web Browser
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		//Switch to first frame
		//driver.switchTo().frame(0); // By ID
		//driver.switchTo().frame("packageListFrame"); // By Name

		WebElement iFrameElement = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(iFrameElement); // By WebElement

		driver.findElement(By.linkText("org.openqa.selenium")).click();

		// Switch to main page
		driver.switchTo().defaultContent(); // main page

		//Switch to 2nd frame
		driver.switchTo().frame(1);
		// Find web element 'Alert' Link Text of second frame 
		driver.findElement(By.linkText("Alert")).click();

		// Switch to main page
		driver.switchTo().defaultContent(); // main page

		// Find and print total iframes on web page
		int noOfiframes =  driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total no of iframes on the web page: " + noOfiframes);

	}

}

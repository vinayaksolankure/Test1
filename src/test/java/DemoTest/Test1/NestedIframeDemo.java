package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Launch Chrome web Browser
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame("frame1"); // parent frame/outer frame
		driver.switchTo().frame("frame3"); // child frame/inner frame

		//Find webelement checkbox
		driver.findElement(By.id("a")).click();

		// Switch to parent frame
		driver.switchTo().parentFrame();
		// find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("Hello");

		// swith to default content/main page
		driver.switchTo().defaultContent();

		//switch to 2nd frame
		driver.switchTo().frame("frame2");

		//find webelement dropdown
		WebElement dropDownElement =  driver.findElement(By.id("animals"));
		Select dropdown = new Select(dropDownElement);
		dropdown.selectByVisibleText("Avatar");
	}
}

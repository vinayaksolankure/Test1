package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverHeadLessBrowserTesting {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
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

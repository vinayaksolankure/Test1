package DemoTest.Test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	
	@Test
	public void verifyPageTitle()
	{
		// Launch Chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String expectedTtile = "Google";
		String actualTtile = driver.getTitle();
		
		Assert.assertEquals(actualTtile, expectedTtile);
		driver.quit();
	}

}

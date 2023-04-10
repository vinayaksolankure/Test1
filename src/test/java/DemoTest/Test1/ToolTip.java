package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String actualTooltip  = driver.findElement(By.xpath("//*[@id='age']")).getAttribute("title");
		
		String expectedTooltip = "We ask for your age only for statistical purposes.";
		
		if(actualTooltip.equals(expectedTooltip))
		{
			System.out.println("Test passed.");
		}
		else
		{
			System.out.println("Test Failed.");
		}
		
		driver.close();

	}

}

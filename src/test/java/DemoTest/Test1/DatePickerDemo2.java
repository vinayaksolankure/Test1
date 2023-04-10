package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//  Launch Chrome web Browser
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		//02-May-2022
		String expectedDay = "8";
		String expectedMonthYear = "July 2023";

		//find date picker webelement to perform click action
		WebElement datepicker = driver.findElement(By.id("onward_cal"));
		datepicker.click();

		while(true) 
		{
			String calenderMonthYear =  driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

			if(calenderMonthYear.equals(expectedMonthYear)) 
			{
				driver.findElement(By.xpath("//td[text()='"+ expectedDay +"']")).click();
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			Thread.sleep(200);
		}

	}

}

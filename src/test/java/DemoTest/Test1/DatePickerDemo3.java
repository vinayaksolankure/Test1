package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//  Launch Chrome web Browser
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");

		//02-May-2022
		String expectedDay = "6";
		String expectedMonthYear = "June 2023";

		//find date picker webelement to perform click action
		WebElement datepicker = driver.findElement(By.xpath("//span[@class='sc-iwjdpV jUsACy fswDownArrow']"));
		datepicker.click();

		while(true) 
		{
			String calenderMonthYear =  driver.findElement(By.xpath("//*[@class='DayPicker-Caption']")).getText();

			if(calenderMonthYear.equals(expectedMonthYear)) 
			{
				driver.findElement(By.xpath("//p[text()='"+ expectedDay +"']")).click();
				driver.findElement(By.xpath("//*[@class='fswTrvl__done']")).click();
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
			}
			Thread.sleep(200);
		}
	}

}

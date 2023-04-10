package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Launch Chrome web Browser
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		// switch to iframe moneyiframe
		driver.switchTo().frame("moneyiframe"); // by ID
		
		String nseindex =  driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseindex);
	}

}

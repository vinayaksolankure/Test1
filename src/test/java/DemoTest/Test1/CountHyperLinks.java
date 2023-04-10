package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //  Launch Chrome web Browser
	    System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();
		
		List<WebElement> ListElements = driver.findElements(By.tagName("a"));
		System.out.println("Total No of Links in web page : " + ListElements.size());
		
		for(WebElement el:ListElements)
		{
			System.out.println(el.getText());
		}
		driver.close();
	}

}

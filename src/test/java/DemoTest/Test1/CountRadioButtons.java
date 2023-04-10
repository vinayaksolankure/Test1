package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio buttons : " + radioButtonList.size());
		driver.close();
		
			
	}

}

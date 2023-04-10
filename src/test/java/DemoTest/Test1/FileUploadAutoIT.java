package DemoTest.Test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement button = driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Runtime.getRuntime().exec("E://OneDrive//Desktop//DemoTest//AutoIT//FileUpload.exe" + " " + "F:\\Data.txt"); 
		// exec - This method has been Deprecated.
	}

}

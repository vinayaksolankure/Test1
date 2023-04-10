package DemoTest.Test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		// Find webelement and choose file using sendkeys method 
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("F:\\Upload File\\Sourabh.txt");
		
		// By using RobotClass
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		// Copy file to clipboard
		StringSelection ss = new StringSelection("F:\\Upload File\\Sourabh.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// perform ctr + v operation to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		

	}

}

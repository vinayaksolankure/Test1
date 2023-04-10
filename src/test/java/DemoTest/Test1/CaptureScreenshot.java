package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/Kyome22/UITestPractice");
		
//		// Capture full page screenshot
//		// Step 1  = convert webdriver object to TakesScreenshot interface
//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
//		// Step 2  = call getScreenshot method to create image file
//		File src = screenshot.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("E:\\OneDrive\\Desktop\\DemoTest\\Eclipse Workspace\\DemoTestMavenProject\\Test1\\Screenshot\\fullpage.png");
//		
//		// Step 3  = copy image file to destination
//		FileUtils.copyFile(src, dest);
		
		
		// Capture screenshot of a section of a webpage 
//		// Step 1  = Find webelement of a particular section
//		WebElement section = driver.findElement(By.xpath("//*[@class='BorderGrid BorderGrid--spacious']"));
//		
//		// Step 2  = call getScreenshot method to create image file
//		File src = section.getScreenshotAs(OutputType.FILE);
//				
//		File dest = new File("E:\\OneDrive\\Desktop\\DemoTest\\Eclipse Workspace\\DemoTestMavenProject\\Test1\\Screenshot\\Section.png");
//				
//		// Step 3  = copy image file to destination
//		FileUtils.copyFile(src, dest);
		
		// Capture screenshot of a specific webelement
		// Step 1  = Find webelement of a particular section
		WebElement element = driver.findElement(By.xpath("//*[@class=\"btn ml-2\"]"));
		
		// Step 2  = call getScreenshot method to create image file
		File src = element.getScreenshotAs(OutputType.FILE);
				
		File dest = new File("E:\\OneDrive\\Desktop\\DemoTest\\Eclipse Workspace\\DemoTestMavenProject\\Test1\\Screenshot\\Element.png");
				
		// Step 3  = copy image file to destination
		FileUtils.copyFile(src, dest);
		
		
		driver.close();

	}

}

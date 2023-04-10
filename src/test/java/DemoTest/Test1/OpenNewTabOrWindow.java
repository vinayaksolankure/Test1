package DemoTest.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		System.out.println("First Page : " + driver.getTitle());

		driver.switchTo().newWindow(WindowType.TAB);  // for window change TAB to WINDOW
		driver.get("https://www.facebook.com/");
		System.out.println("Second tab : " + driver.getTitle());
		
		// get window handles of open windows
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0));  // switch to google.com
		System.out.println("First Page : " + driver.getTitle());
		

	}

}

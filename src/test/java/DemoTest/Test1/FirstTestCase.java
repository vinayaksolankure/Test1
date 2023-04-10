package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    //  Launch Chrome web Browser
	    System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		//Launch the google web page
		driver.navigate().to("http://www.google.com");
			
		//Capture title of google web page and print
		String title  = driver.getTitle();
		System.out.println("Page Title : " + title);
				
		//Capture url of the web page
		System.out.println("URL: " + driver.getCurrentUrl());
					
		//Capture page source
		System.out.println("Web page source : " + driver.getPageSource());
			
		driver.close();

	}

}

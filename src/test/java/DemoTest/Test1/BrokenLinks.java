package DemoTest.Test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		driver.get("http://www.deadlinkcity.com/");
		
		// Find Hyperlinks
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		int resCode = 200; // 2xx response code is valid link;
		int brokenLinkCnt = 0;
		
		System.out.println("Toatal no of links on webpage : " + linkList.size());
		for(WebElement element:linkList)
		{
			String url = element.getAttribute("href");
			
			try
			{
				URL urlLink = new URL(url);
				
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				if(resCode >= 400)
				{
					System.out.println(url +"broken Link");
					brokenLinkCnt++;
					
				}
			}
			
			catch(MalformedURLException e)
			{
				
			}
			catch(Exception e) 
			{
					
			}
		}
		System.out.println("Total broken Links : " + brokenLinkCnt);
		//driver.close();
	}

}

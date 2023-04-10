package DemoTest.Test1;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='saurabh';");
		
		WebElement element = driver.findElement(By.xpath("//*[@name='login']"));
		js.executeScript("arguments[0].click();",element);
		
		//To Refresh the browser window/page
		js.executeScript("history.go(0)");
		
		//To get the domain name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name : " + domain);

		//To get the title name
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title name : " + title);

		//To get the title name
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL : " + url);
		
		//To Draw border around element
		WebElement element1 = driver.findElement(By.xpath("//*[@class='fb_logo _8ilh img']"));
        js.executeScript("arguments[0].style.border = '3px solid red';",element1);
        
        //To Zoom page
        js.executeScript("document.body.style.zoom='100%'");
        
        // To get the height and width of the web page
        String height = js.executeScript("return window.innerHeight;").toString();;
        System.out.println("Height is :" + height);
        String width = js.executeScript("return window.innerWidth;").toString();;
        System.out.println("width is :" + width);
        Thread.sleep(3000);
        
        // To perform scroll on an application
        // Scroll vertically till the end 
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // Scroll vertically page up
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        
        // To generate alert popup window in selenium webdriver
        js.executeScript("alert('Alert message.')");
        Thread.sleep(2000);
        // To navigate to a different page using javascript
        js.executeScript("window.location = 'https://www.bbc.com/'");
        
        
	}

}

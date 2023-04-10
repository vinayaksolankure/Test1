package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\OneDrive\\Desktop\\DemoTest\\Eclipse Workspace\\DemoTestMavenProject\\Test1\\SampleTable.html");

		// Find last column and second row in webtable and print the data
		String text = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[4]")).getText();
		System.out.println(text);
		
		// Find total number of rows in webtable
		List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("row: " + rowList.size());
		
		// Find total number of columns in webtable
		List <WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("column: " + columnList.size());
		
		for(int r=2; r<=rowList.size(); r++)
		{
			for(int c=1; c<=columnList.size(); c++)
			{
				String data = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.println(data);
			}
		}
		
		
		driver.close();
	}

}

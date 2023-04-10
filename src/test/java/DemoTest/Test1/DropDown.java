package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("input-country"));
		
		Select dropdown = new Select(element);
		//dropdown.selectByVisibleText("Iceland");
		//dropdown.selectByValue("98");
		dropdown.selectByIndex(6);
		
		if(dropdown.isMultiple())
		{
			System.out.println("Dropdown is multiple");
		}
		else
		{
			System.out.println("Dropdown is not multiple");
		}
		
		List <WebElement> alldropdownoptions = dropdown.getOptions();
		
		for(WebElement el:alldropdownoptions)
		{
			System.out.println(el.getText());
		}
		
		try
		{
			dropdown.deselectByIndex(6);
		}
		catch(Exception ex)
		{
			System.out.println("Unable to deselect.");
		}
		
		System.out.println("Total options = " + alldropdownoptions.size());
		//driver.close();
		
	}

}

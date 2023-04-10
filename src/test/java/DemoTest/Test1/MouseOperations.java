package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/buttons");
		
		// Right Click
		/*
		 * WebElement button = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		 * 
		 * Actions act = new Actions(driver);
		 * act.contextClick(button).build().perform(); // contextClick() method is for
		 * right click
		 */		
		// Double click
		
//		  WebElement button = driver.findElement(By.xpath("//*[@id='doubleClickBtn']")); 
//		  Actions act = new Actions(driver); 
//		  act.doubleClick(button).perform();
		 
		
		//Drag and drop
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		// Find source and target web elements
//		WebElement source = driver.findElement(By.xpath("//*[@id='box6'][contains(text(),'Rome')]"));//rome
//		WebElement target = driver.findElement(By.xpath("//*[@id='box106'][contains(text(),'Italy')]"));//italy
//		
//		Actions act = new Actions(driver);
//		act.dragAndDrop(source, target).build().perform();
		
		// Mouse Over
		driver.get("https://uidai.gov.in/en/");
		WebElement element = driver.findElement(By.xpath("//*[@id='menu2523']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform(); // moveToElement() is for mouse over

	}

}

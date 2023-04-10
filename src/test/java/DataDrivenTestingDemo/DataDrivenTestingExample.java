package DataDrivenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		XSSFWorkbook ExelWBook = null;
		XSSFSheet ExelWSheet;
		XSSFRow Row;
		XSSFCell Cell;

		// create an object of file class to open file
		File exelFile = new File("F:\\Leave_Balance_Report1675486545161.xls");

		// create object of FileInputStream to read the data from file
		FileInputStream inputStream = null;
		try 
		{
			inputStream = new FileInputStream(exelFile);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

		// Excel -> Workbook -> Sheet -> Row -> Cell
		// create object of XSSFWorkbook to handle xlsx file
		try {
			ExelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// to access workbook sheet
		ExelWSheet = ExelWBook.getSheetAt(0);

		// get total row count
		int ttlrows = ExelWSheet.getLastRowNum() + 1;
		System.out.println(ttlrows);

		// get total no of cells in a row
		int ttlCells = ExelWSheet.getRow(0).getLastCellNum();
		System.out.println(ttlCells);

		for(int currentRow=0; currentRow<ttlrows; currentRow++)
		{
			//			for(int currentCell=0; currentCell<ttlCells; currentCell++)
			//			{
			//				System.out.print(ExelWSheet.getRow(currentRow).getCell(currentCell).toString());
			//				System.out.print("\t");
			//			}
			//			
			//			System.out.print("\n");

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");

			// enter username
			driver.findElement(By.id("user-name")).sendKeys(ExelWSheet.getRow(currentRow).getCell(0).toString());

			// enter password
			driver.findElement(By.id("password")).sendKeys(ExelWSheet.getRow(currentRow).getCell(1).toString());
			
			driver.findElement(By.id("login-button")).click();
			
			Thread.sleep(3000);
			
			driver.quit();
		}

		try {
			ExelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

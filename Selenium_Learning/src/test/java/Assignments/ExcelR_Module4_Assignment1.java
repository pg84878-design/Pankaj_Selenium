package Assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Learning.ExcelUtil;

public class ExcelR_Module4_Assignment1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String excelpath = "C:\\Users\\Pankaj\\git\\repository\\Selenium_Learning\\Selenium_Excel\\selenium_excel.xlsx";
		ExcelUtil excelutil = new ExcelUtil(excelpath, "sheet1");
		driver.get("http://demo.guru99.com/V4/");
		
		for(int i=1; i<=excelutil.getRowCount();i++)
		{
			String email = excelutil.getCellData(i, 0);
			String password = excelutil.getCellData(i, 1);
			
			WebElement emailfield = driver.findElement(By.xpath("//input[@name='uid']"));
			emailfield.clear();
			emailfield.sendKeys(email);
			
			WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
			passwordfield.clear();
			passwordfield.sendKeys(password);
			
			WebElement loginbutton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
			loginbutton.click();
			Thread.sleep(5000);
			
			try {
                // If invalid credentials: alert appears
                Alert alert = driver.switchTo().alert();
                System.out.println("Login failed for user");
                alert.accept();
            } catch (Exception e) {
                // If valid login: perform logout
                System.out.println("Login successful for user");
                driver.findElement(By.linkText("Log out")).click();
                Alert logoutAlert = driver.switchTo().alert();
                logoutAlert.accept();
            }
			
			
		}
		
		excelutil.close();

	}

}

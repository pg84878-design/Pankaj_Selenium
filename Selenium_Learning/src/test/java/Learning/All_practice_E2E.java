package Learning;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_practice_E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Jain");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("raj3232356@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Raj@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[3]//div[1]//div[2]//div[3]//div[2]//input[1]")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select drop = new Select(dropdown);
		drop.selectByValue("41");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Villa 1 , Phase 1");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("111111");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("8687878787");
		
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\Pankaj\\git\\repository\\Selenium_Learning\\Screenshot_exp\\E2E_Assignment.jpeg");
		
		source.renameTo(target);
		Thread.sleep(6000);
		driver.quit();
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		
		
		
		

	}

}

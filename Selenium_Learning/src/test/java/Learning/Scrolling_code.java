package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.WebElementToJsonConverter;

public class Scrolling_code {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// By Pixel
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,400)", "");
		
		//Till the bottom of the page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//till the element
		WebElement ele=driver.findElement(By.xpath("//input [@id='vote-poll-1']"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
		Thread.sleep(5000);

		
	}

}

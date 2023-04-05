package session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://www.target.com/");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement target1 =
		driver.findElement(By.xpath("//span[text()='Save on, saver']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scroll down
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(2000);
		
		
		//scroll up
		js.executeScript("window.scrollBy(0, -1500)");
		Thread.sleep(2000);
		
		
		//scroll up to a targeted element 
		js.executeScript("arguments[0].scrollIntoView()", target1);
		Thread.sleep(2000);
		
		
		//scrolling all the way down
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		System.out.println("Scrolling complete");
//		WebElement deals = 
//		driver.findElement(By.xpath("//img[@alt='Target Deals ']"));
		
		//deals.click();
		
		
		
		//driver.close();
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverActions {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//use sendkeys method on a web element 
		WebElement userName =  driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		//clicking on login button
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		//clearing 
		userName.clear();
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

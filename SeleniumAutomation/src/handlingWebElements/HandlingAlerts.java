package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		
		//clicking on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		//changing the focus of the driver to alert and saving alert under a variable
		Alert popUp = driver.switchTo().alert();
		
		//capturing the text present in the alert 
		String alertMessage = popUp.getText();
		
		String expectedMessage = "Please enter a valid user name";
		
		if(alertMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Alert message is validated");
		}else {
			System.out.println("Alert did not match!!");
		}
//		System.out.println(alertMessage);
		
		Thread.sleep(1000);
		
		// handling or accepting the alert 
		popUp.accept();
		Thread.sleep(1000);
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

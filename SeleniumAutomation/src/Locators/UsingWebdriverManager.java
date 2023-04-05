package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebdriverManager {

	public static void main(String[] args) {
		
		//launching Edge browser using webdrivermanager
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
//		//launching Firefox browser using webdrivermanager
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
//		//launching chrome browser using webdrivermanager
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://theautomationzone.blogspot.com/");
		// maximizing
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(), 'with small delay')]")).click();
	
		//crating a reference variable of WebDriverWait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		
		//setting wait conditions for the element and capturing the text
		//saving the text under a variable 
	String message = 	wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//p[contains(text(), 'with small delay')]"))).getText();
		//printing the text 
		System.out.println(message);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

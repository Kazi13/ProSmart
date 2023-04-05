package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		//for chrome
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//for firefox
//		WebDriver driver = new FirefoxDriver();
		//for Edge 
//		System.setProperty("webdriver.edge.driver", "c:\\Tools\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		// WebDriver driver = new FirefoxDriver();
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

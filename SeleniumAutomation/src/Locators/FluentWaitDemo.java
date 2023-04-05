package Locators;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "c:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://theautomationzone.blogspot.com/");
		// maximizing
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[contains(text(), 'with small delay')]")).click();

//		//crating a reference variable of WebDriverWait class
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
//		
//		//setting wait conditions for the element and capturing the text
//		//saving the text under a variable 
//	String message = 	wait.until(ExpectedConditions.elementToBeClickable
//				(By.xpath("//p[contains(text(), 'with small delay')]"))).getText();
//		//printing the text 
//		System.out.println(message);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		String message = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'with small delay')]")))
				.getText();
		//printing the text 
		System.out.println(message);

	}

}

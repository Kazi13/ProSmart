package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		// https://ultimateqa.com/simple-html-elements-for-automation/
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// wait implicitly for 15 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// open the url
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		
		//identifying click me element with the attribute ID 
//		WebElement clickMeButton =  driver.findElement(By.id("button1"));		
//		clickMeButton.click();
		
//		WebElement button = driver.findElement(By.className("buttonClass"));
//		button.click();
		
//		WebElement nameButton =   driver.findElement(By.name("button1"));		
//		nameButton.click();
		
//		WebElement link =   driver.findElement(By.linkText("Click this link"));
//		link.click();
		
		// Click this link
		
//		WebElement partialLink =  driver.findElement(By.partialLinkText("Click this "));
//		partialLink.click();
		
		
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("This page contains " + totalLinks + " links.");
		
		// clicking on button link 
		//driver.findElement(By.cssSelector("#idExample")).click();
		
		//clicking on the 2nd button 
		driver.findElement(By.cssSelector("button.buttonClass[type=submit]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

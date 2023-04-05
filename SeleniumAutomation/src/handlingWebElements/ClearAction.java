package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearAction {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://www.google.com/");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//capturing a web element and saving it under a variable 
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//use sendkeys method on a web element 
		searchBox.sendKeys("search for meat");
		//wait only for demo purpose 
		Thread.sleep(2000);
		
		//clear the search field 
		searchBox.clear();
		
		//caputring gmail link and saving it under a variable 
		WebElement gmailLink = 
		driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']"));
		//capture the text of a web element 
		String text = gmailLink.getText();
		//print the text
		System.out.println("The text is: " + text);
		
		//get an attribute of Gmail link 
		String completeLink = gmailLink.getAttribute("href");
		//print the link
		System.out.println("The entire link is: " + completeLink);
		
		//driver.
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

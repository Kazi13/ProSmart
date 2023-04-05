package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingLinks {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("http://gcreddy.com/project/admin/login.php");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Online Catalog']"));
		
		//is displayed
		boolean status = link.isDisplayed();
		System.out.println(status);
		
		//is enabled
		status = link.isEnabled();
		System.out.println(status);
		
		//capture the name of the link 
		String linkText = link.getText();
		System.out.println("The label of the link is: " + linkText);
		
		
		// click able 
		link.click();
		String landingUrl = driver.getCurrentUrl();
		String expectedUrl = "http://gcreddy.com/project/";
		if (landingUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Link worked!!");
		} else {
			System.out.println("Test failed!");
		}
				
		driver.quit();
		

	}

}

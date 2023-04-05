package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class RelativeLocator1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "c:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximizing 
		driver.manage().window().maximize();
		//adding implicit wait 
		//implicit wait - implicitly waits for a web element to be available for a given amount of time  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//identify a web element which will help us to find out our desired element 
		WebElement xyz = driver.findElement(By.xpath("//label[text()='Password']"));
		//using relative locator above to find out an input tag (user name field)
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(xyz)).sendKeys("Admin");
		
		//identifying password field in relation to password(xyz) label
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(xyz)).sendKeys("admin123");
		
		
		
		
		
		

	}

}

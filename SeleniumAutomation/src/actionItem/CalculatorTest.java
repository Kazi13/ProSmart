package actionItem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorTest {

	/*Q1. Go to https://theautomationzone.blogspot.com/2022/01/calculator.html 
	Using relative locators do a calculation -> 3X8 and capture the result.
	*/
	
	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://theautomationzone.blogspot.com/2022/01/calculator.html");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//clicking on 3
		driver.findElement(with(By.tagName("input")).toRightOf(By.xpath("//input[@value='2']"))).click();
		
		// clicking on * sign
		driver.findElement(with(By.tagName("input")).toRightOf(By.xpath("//input[@value='=']"))).click();
		
		// clicking on 8 button
		driver.findElement(with(By.tagName("input")).below(By.xpath("//input[@value='5']"))).click();
		
		// clicking on = sign
		driver.findElement(with(By.tagName("input")).below(By.xpath("//input[@value='9']"))).click();
		
		// identify result field
		WebElement result =
		driver.findElement(with(By.tagName("input")).above(By.xpath("//input[@value='1']")));
		
		//capturing the result 
		String finalResult = result.getAttribute("value");
		System.out.println("The result is: " + finalResult);
				
		driver.close();
				
	}
	
}

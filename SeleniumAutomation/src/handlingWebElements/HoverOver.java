package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverOver {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.mortgagecalculator.org/");

		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// maximizing the window
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// saving the element under a variable

		// identify the element
		WebElement arm = driver.findElement(By.xpath("//a[text()='ARM']"));
		
		//create object of Action Class
		Actions act = new Actions(driver);
		//do mouse/hover over action
		act.moveToElement(arm).perform();
		
		
		

	}

}

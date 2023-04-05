package session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://jqueryui.com/droppable/");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switching to the respective frame with the WebElement 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		//saving the WebElements under variables 
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		//crate an object of Actions class 
		Actions drag = new Actions(driver);
		
		//drag.clickAndHold(draggable).moveToElement(droppable)
		
		drag.clickAndHold(draggable).moveToElement(droppable).build().perform();
		
		Thread.sleep(2000);
		System.out.println("Drag and drop successful.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

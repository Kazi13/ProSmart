package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTable {

	public static void main(String[] args) {


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// maximizing the window
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// saving the element under a variable

		// identify the element
		WebElement customerTable = driver.findElement(By.xpath("//table[@id='customers']/child::tbody"));
		//capturing all the rows of the table 
		List<WebElement> rows =   customerTable.findElements(By.tagName("tr"));
		
		for(WebElement row:rows) {
			
		List<WebElement> cells = row.findElements(By.tagName("td"));
			
			for (WebElement cell:cells) {
				System.out.print(cell.getText() + "\t");
			}
			System.out.println();
		}
		
		driver.close();
	}

	
	
	
	
	
	
	
	
	
}

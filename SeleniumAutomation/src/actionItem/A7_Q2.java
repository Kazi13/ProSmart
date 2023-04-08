package actionItem;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/* Q2. From https://demo.guru99.com/test/web-table-element.php site find out total 
number of rows, total number of columns and print all the values for IDFC Bank.
*/

public class A7_Q2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement> columns =  table.findElements(By.tagName("th"));		
		System.out.println("Total columns >> " + columns.size() );
		
		//find out the rows 
		List<WebElement> rows =  table.findElements(By.xpath(".//th | .//tr"));
		
		System.out.println("Total rows are: " + rows.size());
		System.out.println(
		driver.findElement(By.xpath("//table[@class='dataTable']/tbody/child::tr[6]")).getText());
		
		driver.close();

	}

}

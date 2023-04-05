package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesTest {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		//saving the element under a variable 
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='cb1']"));
		
		//displayed
		checkBox1.isDisplayed();
		//enabled
		checkBox1.isEnabled();
		//selected status 
		checkBox1.isSelected();
		//checking all three conditions to click on the check box
		if(checkBox1.isDisplayed() && checkBox1.isEnabled() && !checkBox1.isSelected()) {
			checkBox1.click();
		}
		//printing the status 
		System.out.println("Check box is selected: " + checkBox1.isSelected() );
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioButtons {

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
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='rd1']"));
		
		//displayed
		radioButton1.isDisplayed();
		//enabled
		radioButton1.isEnabled();
		//selected status 
		radioButton1.isSelected();
		//checking all three conditions to click on the check box
		if(radioButton1.isDisplayed() && radioButton1.isEnabled() && !radioButton1.isSelected()) {
			radioButton1.click();
		}
		//printing the status 
		System.out.println("This radio button is selected: " + radioButton1.isSelected() );
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

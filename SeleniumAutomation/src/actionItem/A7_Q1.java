package actionItem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Q1.Navigate to https://testpages.herokuapp.com/styled/basic-html-form-test.html fill out 
the form (please do not upload any file, exclude automating the field), click 2nd check box, 
click on radio 3, select Selection Item 3, select drop down Item 6, click on submit button. 
Capture all the submitted values from the landing page and print it in the console. 
*/

public class A7_Q1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Input the username field 
		driver.findElement(By.name("username")).sendKeys("ProSmart");
		
		//Input the password field 
		driver.findElement(By.name("password")).sendKeys("userPass");
		
		//Input the password field 
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("It's just a comment!!");
		
		//handling checkbox3 
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='cb3']"));
		if(checkBox.isDisplayed() && checkBox.isEnabled() && !checkBox.isSelected()) {
			checkBox.click();			
		}
		//handling radio button
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='rd3']"));
		if(radioButton.isDisplayed() && radioButton.isEnabled() && !radioButton.isSelected()) {
			radioButton.click();
		}	
		
		// handling selection Item 3
		driver.findElement(By.xpath("//option[@value='ms3']")).click();
		
		//handling dropdown
		Select dropDn = new Select(driver.findElement(By.xpath("//select[@name='dropdown']")));
		dropDn.selectByValue("dd6");
		
		//click on Submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Capturing all the inputs and printing all of them
		
		System.out.println("Value for username field >> " + driver.findElement(By.id("_valueusername")).getText());
		System.out.println("Value for password field >> " + driver.findElement(By.id("_valuepassword")).getText());
		System.out.println("Value for comments field >> " + driver.findElement(By.id("_valuecomments")).getText());
		System.out.println("Value for checkbox field >> " + driver.findElement(By.id("_valuecheckboxes0")).getText());
		System.out.println("Value for radio button field >> " + driver.findElement(By.id("_valueradioval")).getText());
		System.out.println("Value for multi select field >> " + driver.findElement(By.id("_valuemultipleselect0")).getText());
		System.out.println("Value for dropdown field >> " + driver.findElement(By.id("_valuedropdown")).getText());
		System.out.println("Value for submit button >> " + driver.findElement(By.id("_valuesubmitbutton")).getText());

		System.out.println("All values are captured!!");
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

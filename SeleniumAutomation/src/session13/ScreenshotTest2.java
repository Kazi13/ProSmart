package session13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest2 {

	
	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://www.google.com");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		//google searching for Selenium and hitting enter in the keyboard 
		driver.findElement(By.name("q")).sendKeys("Best holiday destinations", Keys.ENTER);
		
		//calling captureScreenshot method and passing two arguments 
		captureScreenshot(driver, currentTime());
		
		driver.close();
				
	}
	
	public static void captureScreenshot(WebDriver driver, String time) throws Exception  {
	//capturing the screenshot and capturing under src variable where data type is File	
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//saving the file 
	Files.copy(src, new File("C:\\Users\\ProSmart\\Downloads\\Sample\\image_"+time+".png"));
	System.out.println("Screenshot captured!");		
	}
	
	
	public static String currentTime() {
		Date date = new Date();		
	return	new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(date);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

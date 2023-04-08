package actionItem;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
* Q6. Go to https://testpages.herokuapp.com/frames/index.html , click on Load
* white page link, click on Back to original page, click on Load green page,
* click on Back to original page and print the text of “Menu 1” element
* (available on the left side of the screen).
*/


public class A7_Q6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximizing the window
		driver.manage().window().maximize();

		driver.get("https://testpages.herokuapp.com/frames/index.html");
		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='content']")));
		//click on different links
		driver.findElement(By.xpath("//a[contains(text(),'white')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'original')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'green')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'original')]")).click();
		//switch back to the parent frame
		driver.switchTo().parentFrame();
		driver.switchTo().frame("menu");
		String title = 
		driver.findElement(By.xpath("//h3[text()='Menu 1']")).getText();
		System.out.println("The text of this field is >> " + title);
		
		captureScreenshot(driver, currentTime());
		System.out.println("Frame validation is over!");
		driver.close();		
	}
	
	public static void captureScreenshot(WebDriver driver, String time) {
		
		try {
			File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("C:\\Users\\ProSmart\\Downloads\\Sample\\image_"+time+".png"));

			System.out.println("Screenshot captured.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Screenshot could not be captured!");
		} 
	}
	
	public static String currentTime() {
		Date date = new Date();
		return new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(date);
	}

}

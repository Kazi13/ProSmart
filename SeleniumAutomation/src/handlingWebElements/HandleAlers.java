package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlers {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		//adding page load timeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//1st Green Box
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		//2nd Green Box
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		String secondResponse = 
		driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText();
		System.out.println(secondResponse);
		
		
		//3rd Green Box
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.accept();
		String thirdResponse = 
				driver.findElement(By.xpath("//p[@id='promptexplanation']")).getText();
		System.out.println(thirdResponse);
		//closing the browser
		driver.close();
		
		
	}

}

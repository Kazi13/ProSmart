package actionItem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Q4. Open your browser in headless mode, go to http://automationpractice.com/index.php , 
capture the title and url of the page, click on Sign in link, capture the title and 
url of the landing page, print them in the console and finally close the browser.
*/

public class A7_Q4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		// options.setHeadless(true);
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
	}

}

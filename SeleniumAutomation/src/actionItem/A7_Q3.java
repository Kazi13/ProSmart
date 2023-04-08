package actionItem;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A7_Q3 {

	/*
	 * 03. Go to https://www.selenium.dev/ and find out total number of links in the
	 * following section of the screen and print it.
	 */
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximizing the window
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");
		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scrolling down
		WebElement section = driver.findElement(By.xpath("//div[contains(@class,'row justify-content-aro')]"));
		js.executeScript("arguments[0].scrollIntoView()", section);

		List<WebElement> links = section.findElements(By.tagName("a"));
		System.out.println("Total links in this section are " + links.size());

		int count = 0;
		for (WebElement link : links) {
			// capturing texts associated with all the links
			System.out.println(link.getText());

			// capture all the href attributes of all these links
			// saving the href values under linkUrl variable
			String linkUrl = link.getAttribute("href");

			if (linkUrl != null) {
				// verify the link if it returns less than 400 value or not
				verifyUrlLink(linkUrl);
			} else {
				count++;
			}
		}
		System.out.println("Total null links are: " + count );
		driver.close();
		System.out.println("Link validation is complete!");
		System.out.println("Total valid links : " + (links.size()-count));
	}

	
	
	
	public static void verifyUrlLink(String linkUrl) throws Exception {
		HttpURLConnection httpURLConnection = null;
		try {// creating an object of URL class
			URL url = new URL(linkUrl);
			// typecasting url into HttpURLConnection interface
			httpURLConnection = (HttpURLConnection) url.openConnection();
			// setting connection timeout
			httpURLConnection.setConnectTimeout(1000);
			// connect with the url
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() >= 400) {
				System.out.println(linkUrl + "is a broken link.");
			} else {
				System.out.println(linkUrl + "is a valid link.");
			}
		} catch (MalformedURLException e) {
			System.out.println(linkUrl + "is not a valid URL.");
		} catch (IOException e) {
			System.out.println(linkUrl + "is a broken link.");
		} finally {
			// Disconnect the url connection
			httpURLConnection.disconnect();
		}

	}

}

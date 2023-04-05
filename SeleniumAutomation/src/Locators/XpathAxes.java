package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "c:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		String cityName = driver.findElement(By.xpath
		("//table[@class='zebra fw tb-theme']/child::tbody/child::tr[1]/td[1]")).getText();
		
		System.out.println("Name of the first city: " + cityName);
		
		driver.close();
	}

}

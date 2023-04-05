package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebdriverManager {

	public static void main(String[] args) {
//		//Import webdriverManager and setup edge driver 
//		WebDriverManager.edgedriver().setup();
//		//create a webdriver instance of EdgeDriver 
//		WebDriver driver = new EdgeDriver();
		/*
		 * How can we do the same thing using chrome?
		 */
		
		//Setting up chromedriver 
		WebDriverManager.chromedriver().setup();
//		If webdrivermanager is now working with chrome for you 
		// replace line 22 with the following two lines 
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		
		
		//create a webdriver instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
				
		//with the help of the driver reference we are getting the url 
		driver.get("https://www.facebook.com/");
		
		
		
		
		

	}

}

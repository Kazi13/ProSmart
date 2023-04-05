package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenInFirefox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https:www.facebook.com/");

	}

}

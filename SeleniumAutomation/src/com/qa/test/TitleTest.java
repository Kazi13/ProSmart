package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleTest {

	public static void main(String[] args) {
		//https://ultimateqa.com/simple-html-elements-for-automation/ 
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//Maximize the window 
		driver.manage().window().maximize();
		
		//wait implicitly for 15 seconds		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//open target.com 
		driver.get("https://target.com/");
		
		String expectedTitle =  "Target : Expect More. Pay Less.";
		
		//capturing actual title 
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equalsIgnoreCase(actualTitle) ) {
			System.out.println("Title validation passed.");
		} else {
			System.out.println("Title validation failed !!");
		}
		
		driver.close();
	}

}

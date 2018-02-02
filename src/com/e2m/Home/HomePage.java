package com.e2m.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	
	
	public static void openHomePage(){
		
		System.setProperty("webdriver.gecko.driver","/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://cmsuat2.event2mobile.com/");
		
		driver.manage().window().maximize();
		
	}
	
	public static void main(String args[]){
		
		openHomePage();
	}

}

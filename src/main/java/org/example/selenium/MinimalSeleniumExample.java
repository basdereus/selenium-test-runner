package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinimalSeleniumExample {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		// Visit Google website
        driver.get("http://www.google.com");
        driver.quit();
	}
}

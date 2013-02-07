package org.example.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleTest {

	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testGoogle() {
        // Visit Google website
        driver.get("http://www.google.com");
	}
	
	@After
	public void tearDown() {
		driver.quit();		
	}
}

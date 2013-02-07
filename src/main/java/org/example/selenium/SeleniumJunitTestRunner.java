package org.example.selenium;

import org.junit.runner.JUnitCore;

public class SeleniumJunitTestRunner {
	
	public static void main(String[] args) {
		// This should be command-line argument based
		JUnitCore.runClasses(ExampleTest.class);
	}
}

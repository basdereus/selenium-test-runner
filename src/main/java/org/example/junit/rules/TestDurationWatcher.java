package org.example.junit.rules;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestDurationWatcher extends TestWatcher {

	private static long startingTime;
	private static long finishedTime;

	@Override
	protected void starting(Description description) {
		startingTime = System.currentTimeMillis();
	}
	
	@Override
	protected void finished(Description description) {
		finishedTime = System.currentTimeMillis();
		long duration = finishedTime - startingTime;
		System.out.println(duration);
	}
	
	@Override
	protected void failed(Throwable e, Description description) {
		System.out.println("Failed : " + description.getMethodName());
		System.out.println("Error message : " + e.getMessage());
	}
	
	@Override
	protected void succeeded(Description description) {
		System.out.println("Successful : " + description.getMethodName());
	}
}

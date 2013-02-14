package org.example.junit;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class MonitoringTest {

	private static Date startingTime;
	private static Date finishedTime;

	@Rule
 	public TestRule watcher = new TestWatcher() {
		@Override
		protected void starting(Description description) {
			startingTime = new Date();
		}
		
		@Override
		protected void finished(Description description) {
			finishedTime = new Date();
			long duration = finishedTime.getTime() - startingTime.getTime();
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
	};

	@Test
	public void testFailure() {
		fail();
	}

	@Test
	public void testSuccess() {
	}
}

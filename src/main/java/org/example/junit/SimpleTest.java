package org.example.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void testFailure() {
		fail();
	}

	@Test
	public void testSuccess() {
	}
}

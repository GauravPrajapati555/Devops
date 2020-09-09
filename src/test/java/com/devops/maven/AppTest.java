package com.devops.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App test = new App();
		String output = test.Gaurav();
		assertEquals("Hello Everyone! Lets try Devops",output);
	}

}

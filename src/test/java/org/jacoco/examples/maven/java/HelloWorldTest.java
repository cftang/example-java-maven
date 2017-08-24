package org.jacoco.examples.maven.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setUp() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessageTrue() {
		assertEquals("Hello Universe 1!", subject.getMessage(true));
	}
	
	@Test
	public void testGetMessageFalse() {
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
}

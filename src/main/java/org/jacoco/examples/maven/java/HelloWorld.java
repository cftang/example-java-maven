package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe 1!";
		} else {
			return "Hello World! 2";
		}
	}

}

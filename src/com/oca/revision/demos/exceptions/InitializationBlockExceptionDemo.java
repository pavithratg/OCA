package com.oca.revision.demos.exceptions;

import java.io.IOException;

public class InitializationBlockExceptionDemo {

	static int[] x = new int[0];

	static {

		/*
		 * Note that the program ends with ExceptionInInitializerError because
		 * any exception thrown in a static block is wrapped into
		 * ExceptionInInitializerError and then that ExceptionInInitializerError
		 * is thrown.
		 * 
		 * Remember that a static or instance initializer can only throw an
		 * unhandled RuntimeException to the outside. If you try to throw a
		 * unhandled checked exception from a static or instance initializer
		 * block to the outside, the code will not compile
		 * 
		 * Even though the line x[0] = 10; will throw
		 * java.lang.ArrayIndexOutOfBoundsException, JVM will wrap it and
		 * rethrow java.lang.ExceptionInInitializerError.
		 */
		x[0] = 10;

		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new InitializationBlockExceptionDemo();

	}

}

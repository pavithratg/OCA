package com.oca.revision.demos.misc;

public class NoMain {

	/*
	 * Compiles fine, but at runtime gives following error, Error:
	 * 
	 * Main method must return a value of type void in class Test, please define
	 * the main method as: public static void main(String[] args)
	 */

	public static long main(String[] args) {
		return 10L;
	}

}

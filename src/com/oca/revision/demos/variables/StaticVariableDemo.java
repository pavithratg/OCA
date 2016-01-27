package com.oca.revision.demos.variables;

public class StaticVariableDemo {

	// unlike instance variables, static variables loaded when the
	// class first loaded and there is only one copy of static variables to
	// share among instances of the class.

	private static int a = 10;

	/*
	 * first way to initialize a static variable : immediately after declaration
	 * private static final int b = 20;
	 */

	// final static variables cannot initialized in object constructors, since
	// it runs every time a new object is instantiated
	private static final int B;

	// static initializer blocks run only once when the class first loaded.
	static {
		a = 20;

		/*
		 * the second way to initialize a static final variable : initialize it
		 * in a static block
		 */
		B = 30;
	}

	public StaticVariableDemo(int a) {
		// non final static variables can be assigned within a constructor,
		// final static variables cannot be assigned within a constructor
		StaticVariableDemo.a = a;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(B);
		new StaticVariableDemo(50);
		System.out.println(a);
	}
}

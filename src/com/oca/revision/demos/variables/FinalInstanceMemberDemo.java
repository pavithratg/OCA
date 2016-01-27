package com.oca.revision.demos.variables;

public class FinalInstanceMemberDemo {

	// instance variables can be public, default, protected, private
	final int a;

	/*
	 * First way to initialize a final instance variable : immediately
	 * initialize after declaring final int a = 10;
	 */

	/*
	 * Second way is to initialize the final instance variable : within a
	 * constructor public FinalInstanceMemberDemo(int a) { this.a = a; }
	 */

	/*
	 * Third way to initialize a final instance variable : within initialization
	 * blocks
	 */
	{
		this.a = 10;
	}

	// Final instance variable initialization cannot be happened within a static
	// block, since the class level is not aware of the object, final variable
	// belongs to.
	static {

	}

	// Final instance variable initialization cannot be happened within a
	// method. It should be happened before the constructor completes, therefore
	// initialization cannot be taken place in a method.
	void initialize(int a) {
		// this.a = a;
	}
}

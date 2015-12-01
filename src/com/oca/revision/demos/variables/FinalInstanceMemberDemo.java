package com.oca.revision.demos.variables;

public class FinalInstanceMemberDemo {

	// instance variables can be public, default, protected, private
	final int a;

	/*
	 * First way to initialize a final instance variable : immediately
	 * initialize after declaring final int a = 10;
	 */

	/*
	 * Second way is to initialze the final instance variable : within a
	 * constructor public FinalInstanceMemberDemo(int a) { this.a = a; }
	 */

	/*
	 * Third way to initilize a final instance variable : within initialization
	 * blocks
	 */
	{
		this.a = 10;
	}
	
	// Final instance variable initialization cannot be happened within a static block.
	static{
		
	}

	// Final instance variable initialization cannot be happened within a method.
	void initialize(int a) {
		// this.a = a;
	}
}

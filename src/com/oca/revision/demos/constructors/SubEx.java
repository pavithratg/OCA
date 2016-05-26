package com.oca.revision.demos.constructors;

/*
 * The order of execution at class loading  :
 * 
 * 1. super static blocks/ static variables in the order they appear
 * 2. sub static blocks/ static variables in the order they appear
 * 
 * 
 * As the constructor get executed the order of execution :
 * 
 * 1. super class instance variables (get explicit values)/ instance blocks in the order they appear
 * 2. super class constructor completes
 * 
 * 3. sub class instance variables (get explicit values)/ instance blocks in the order they appear
 * 4. sub class constructor completes
 * */

public class SubEx extends SuperEx {

	int b = 50;

	static {
		i = 20;
		System.out.println("sub static block i: " + i);
	}

	{
		System.out.println("b: " + b);
	}

	SubEx() {
		System.out.println("sub constructor i: " + i);
	}

	public static void main(String[] args) {
		new SubEx();
	}

}

class SuperEx {

	static int i;
	int a = 30;

	static {
		i = 15;
		System.out.println("super static block i: " + i);
	}

	{
		System.out.println("a: " + a);
	}

	SuperEx() {
		System.out.println("super constructor i: " + i);
	}

}

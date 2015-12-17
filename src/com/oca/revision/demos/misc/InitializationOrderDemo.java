package com.oca.revision.demos.misc;

public class InitializationOrderDemo {

	/*
	 * Derived class's static or non-static blocks are not executed if that
	 * class is not being used. Since Owner is not at all referred any where,
	 * its static block will not be executed.
	 */

	public static void main(String[] args) {
		new Manager();
	}

}

class Employee {

	static int i = 10;

	{
		i = 15;
		System.out.println("Employee:" + i);
	}

	static {
		System.out.println("Employee static:" + i);
	}
}

class Manager extends Employee {

	static {
		i = 45;
		System.out.println("Manager static:" + i);
	}

	{
		i = 35;
		System.out.println("Manager:" + i);
	}

}

class Owner extends Manager {

	static {
		System.out.println("Owner");
	}

}

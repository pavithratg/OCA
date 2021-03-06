package com.oca.revision.demos.constructors;

public class ValidConstructorDemo {

	/*
	 * You can use only one of public protected and private. Unlike methods, a
	 * constructor cannot be abstract, static, final, native, or synchronized. A
	 * constructor is not inherited, so there is no need to declare it final and
	 * an abstract constructor could never be implemented. A constructor is
	 * always invoked with respect to an object, so it makes no sense for a
	 * constructor to be static. There is no practical need for a constructor to
	 * be synchronized, because it would lock the object under construction,
	 * which is normally not made available to other threads until all
	 * constructors for the object have completed their work. The lack of native
	 * constructors is an arbitrary language design choice that makes it easy
	 * for an implementation of the Java Virtual Machine to verify that
	 * superclass constructors are always properly invoked during object
	 * creation
	 */

	int x;

	public ValidConstructorDemo() {
	}

	public ValidConstructorDemo(int x) {
		this.x = x;
	}

}

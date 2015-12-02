package com.oca.revision.demos.constructors;

public class PrivateConsructorDemo {

	private PrivateConsructorDemo() {
	}

	PrivateConsructorDemo(int x) {
	}

}

class SubPrivateConsructorDemo extends PrivateConsructorDemo {

	/*
	 * Implicit super constructor PrivateConsructorDemo() is not visible for
	 * default constructor since it has private access modifier. Must define an
	 * explicit constructor.
	 */

	/*
	 * Implicit super constructor PrivateConsructorDemo() is not visible. Must
	 * explicitly invoke another constructor.
	 */
	public SubPrivateConsructorDemo(int x) {
		super(x);
	}

}

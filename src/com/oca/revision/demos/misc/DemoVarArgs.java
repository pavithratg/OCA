package com.oca.revision.demos.misc;

public class DemoVarArgs {

	public void test() {
		test1(10);
		test1(10, 20);

		test2(10);
		test2(10, 20);

	}

	// The last parameter is a varargs of type int, which means, it can take any
	// number of integers.
	private void test2(int... i) {

	}

	// Since the only parameter is a varargs of type int, it can take any number
	// of integers.
	private void test1(int... i) {

	}

}

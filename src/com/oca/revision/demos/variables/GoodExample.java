package com.oca.revision.demos.variables;

// This example code demonstrates the order of static and instance 
// variables get initialized or assigned. The output would be bcaedf
public class GoodExample {

	public static String sM(String sm) {
		System.out.print(sm);
		return sm;
	}

	static {
		s = sM("b");
	}

	static String s2 = sM("c");
	static String s = sM("a");

	{
		as = sM("e");
	}

	String as = sM("d");

	public GoodExample() {
		as = sM("f");
	}

	public static void main(String[] args) {
		new GoodExample();
	}
}

package com.oca.revision.demos.variables;

// This example code demonstrates the order of static and instance 
// variables get initialized or assigned. The output would be bcaedf
public class GoodExample {

	public static String sM(String sm) {
		System.out.print(sm);
		return sm;
	}

	static {
		s = sM("b"); // 1
	}

	static String s2 = sM("c"); // 2
	static String s = sM("a"); // 3

	{
		as = sM("e"); // 4
	}

	String as = sM("d"); // 5

	public GoodExample() {
		as = sM("f"); // 6
	}

	public static void main(String[] args) {
		new GoodExample();
	}
}

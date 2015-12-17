package com.oca.revision.demos.misc;

public class StringComparison {

	public static void main(String[] args) {
		String a = "java";
		char[] c = { 'j', 'a', 'v', 'a' };
		String b = new String(c);
		String d = a;

		// Comparing two reference variables, should refer to the same object to
		// be true
		System.out.println(a == d);
		// Comparing a reference variable and a literal, should match the
		// content to be true
		System.out.println(a == "java");
		// Comparing two references using equals method, should match the
		// content to be true
		System.out.println(a.equals(b));
	}

}

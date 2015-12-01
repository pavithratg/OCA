package com.oca.revision.demos.arrays;

public class ExampleCode {
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 4, 6, 0 };

		int x = a[(a = b)[3]];

		System.out.println(x);
	}

}

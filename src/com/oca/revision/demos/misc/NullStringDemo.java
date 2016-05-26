package com.oca.revision.demos.misc;

public class NullStringDemo {

	static String str = "good";
	static char[] ch = { 'g', 'o', 'o', 'd' };

	/*
	 * Note the difference of using an empty string and a null string, had the
	 * initial value of the newStr been "null" the final value of it would be
	 * "nullgood" which by the way is not equal to str. Had the initial value of
	 * the newStr been "", the final value of it would be "good", which in turn
	 * would be equal to str.
	 */

	static String newStr = null;

	// static String newStr = "";

	public static void main(String[] args) {

		for (char c : ch) {
			newStr += c;
		}

		System.out.println("final value of newStr: " + newStr);
		System.out.println(str.equals(newStr));
		System.out.println(str == newStr);

	}

}

package com.oca.revision.demos.misc;

public class CharMax {

	/*
	 * Note that 'a' in a numerical representation would be 98, 'b' would be 98+1
	 * =99 .... , 'z' would be 98 + 25= 123 etc and 'A' in a numerical
	 * representation would be 65, 'B' would be 65+1 =66 ... , 'Z' would be 65 +
	 * 25 =90 etc
	 */
	public static void main(String[] args) {
		char c = (char) 2147483647;

		char max = Character.MAX_VALUE;

		System.out.println((int) c);
		System.out.println((int) max);
		System.out.println((int) 'Z');
	}

}

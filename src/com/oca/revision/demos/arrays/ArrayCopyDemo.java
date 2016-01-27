package com.oca.revision.demos.arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {

		char[] srcArr = { 'A', 'B', 'C', 'D', 'E' };
		// char[] desArr = new char[3];
		char[] desArr = { 'F', 'G', 'H', 'I' };

		/*
		 * 2 object arguments specify the array to copy from and the array to
		 * copy to.
		 * 
		 * 3 int arguments specify the starting position in the source array,
		 * the starting position in the destination array, and the number of
		 * array elements to copy.
		 * 
		 * The elements in the related positions of the destination array will
		 * be replaced by the respective elements in the source array.
		 */
		System.arraycopy(srcArr, 2, desArr, 0, 3);

		for (char c : desArr) {
			System.out.print(c);
		}

	}

}

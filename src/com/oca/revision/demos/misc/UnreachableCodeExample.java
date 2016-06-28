package com.oca.revision.demos.misc;

public class UnreachableCodeExample {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int counter = 0;

		for (int val : arr) {

			if (counter >= 5) {
				break;
			} else {
				continue;
			}

			/***
			 * Observe that the line  if (value > 4) { and the rest of the code
			 * in the for loop will not execute in any case. It is therefore
			 * unreachable code and the compiler will complain about it.
			 ***/
			// if (val > 4) {
			// arr[counter] = val + 1;
			// }
			//
			// counter++;

		}

		System.out.println(arr[counter]);
	}

}

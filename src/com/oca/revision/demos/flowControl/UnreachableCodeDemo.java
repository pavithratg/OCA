package com.oca.revision.demos.flowControl;

public class UnreachableCodeDemo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int num : arr) {
			if (num == 3)
				break;
			else
				continue;// 1

			// code after line 1 is unreachable, code won't compile.
			// System.out.println("in for");
		}
	}

}

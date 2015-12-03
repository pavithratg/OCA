package com.oca.revision.demos.misc;

public class UnreachableCodeDemo {

	public static void main(String[] args) {

		// 1
		// while(false) System.out.println("Unreachable");

		// 2
		// while(true){}
		// System.out.println("Unreachable");

		// 3
		// do {
		// System.out.println("In do while");
		// } while (true);
		// System.out.println("Unreachable");

		// 4
		// for (;;) {
		// }
		// System.out.println("Unreachable");

		// 5
		// for (; false;) {
		// System.out.println("Unreachable");
		// }

	}

	public void foo() {
		return;
		// System.out.println("Unreachable");
	}

}

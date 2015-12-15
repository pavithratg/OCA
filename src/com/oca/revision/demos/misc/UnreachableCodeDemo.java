package com.oca.revision.demos.misc;

public class UnreachableCodeDemo {

	// Compile time constant FLAG
	public static final boolean FLAG = false;
	final boolean flag = false;

	public static final boolean FLAG_OTHER;

	static {
		FLAG_OTHER = false;
	}

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

		// 6
		// while(FLAG){
		// System.out.println("Unreachable");
		// }

		while (FLAG_OTHER) {
			// This is not unreachable statement since FLAG_OTHER is not a
			// compile time constant
			System.out.println("Reachable");
		}

	}

	public void foo() {
		return;
		// System.out.println("Unreachable");
	}

	public void bar() {

		// while(flag){
		// System.out.println("Unreachable");
		// }

	}

}

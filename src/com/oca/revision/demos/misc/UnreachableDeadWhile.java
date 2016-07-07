package com.oca.revision.demos.misc;

public class UnreachableDeadWhile {

	/*
	 * Personal explanation: Unreachable code could happen when we use a compile
	 * time constant with in a if condition, the compiler lets the code to
	 * compile even though it is smart enough to know if condition is never met,
	 * code inside if block never executed, compiler allows this solely for the
	 * debugging purposes.
	 * 
	 * Now lets take example 2, flag is a compile time constant, compiler at the
	 * compile time knows the value of flag is false, therefore the condition to
	 * enter the while loop never meets, code within the while loop never gets
	 * executed, therefore the compilation error occurs.
	 * 
	 * As for the example 1 and example 3, I think as the value of flag comes
	 * incorporated with an object, may be to allow debugging purposes compiler
	 * allows the code to compile, although it is smart enough to know the codes
	 * within will never get executed .
	 */

	final boolean flag = false;

	public static void main(String[] args) {
		/***** example 1 *****/
		while (new UnreachableDeadWhile().flag) {
			System.out.println("I'm dead");
		}
	}

	void foo() {

		/***** example 2 *****/
		// while (flag) {
		// System.out.println("I'm unreachable");
		// }

		/***** example 3 *****/
		while (this.flag) {
			System.out.println("I'm dead");
		}

	}

}

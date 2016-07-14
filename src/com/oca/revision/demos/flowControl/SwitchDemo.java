package com.oca.revision.demos.flowControl;

public class SwitchDemo {

	/*
	 * switch and case literal must be compatible and assignable. If there is no
	 * break after the entry point, code will fall through to subsequent cases.
	 * There cannot be multiple cases with same literal.
	 */

	public static void main(String[] args) {
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("def");
		case 3:
			System.out.println("3");// entry point, if there was a break,
									// execution will not fall through to the
									// next case.
		case 4:
			System.out.println("4");
		}

	}

}

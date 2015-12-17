package com.oca.revision.demos.exceptions;

public class OperandExecution {

	static int doIt() throws Exception {

		throw new Exception("Exception Occured!!!");

	}

	public static void main(String[] args) {
		int i = 1;

		/*
		 * If evaluation of the left-hand operand of a binary operator completes
		 * abruptly, no part of the right-hand operand appears to have been
		 * evaluated. So, as doIt() throws exception, i = 2 never gets executed.
		 */
		try {
			int j = doIt() / (i = 2);
		} catch (Exception e) {
			System.out.println("i= " + i);
		}

	}

}

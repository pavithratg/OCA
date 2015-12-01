package com.oca.revision.demos.exceptions;

public class ExceptionMessage {

	public static void main(String[] args) {
		try {
			test();
		} catch (MyNewException e) {

			/*
			 * When you use System.out.println(exception), a stack trace is not
			 * printed. Just the name of the exception class and the message is
			 * printed.
			 */
			System.out.println(e);

			/*
			 * When you use exception.printStackTrace(), a complete chain of the
			 * names of the methods called, along with the line numbers, is
			 * printed. It contains the names of the methods in the chain of
			 * method calls that led to the place where the exception was
			 * created going back up to the point where the thread, in which the
			 * exception was created, was started.
			 */
			e.printStackTrace();
		}
	}

	static void test() throws MyNewException {
		int[] arr = new int[10];

		// compiles fine but throws an ArrayOutOfBoundException at runtime.
		arr[10] = 10;
		anotherTest();

	}

	static void anotherTest() throws MyNewException {
		throw new MyNewException("Exception starts from anotherTest!");
	}

}

class MyNewException extends Exception {
	public MyNewException(String msg) {
		super(msg);
	}
}

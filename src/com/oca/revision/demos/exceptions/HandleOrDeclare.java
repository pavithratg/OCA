package com.oca.revision.demos.exceptions;

public class HandleOrDeclare {

	// Since NewException is a checked exceptions it should be handled or
	// declared by the method it throws or by the calling methods.
	void throwNewException() throws NewException {
		throw new NewException();
	}

	// Since NullPointerException is an unchecked exception, it is not necessary
	// to handle or declare it by the method it throws or by the calling
	// methods, either way compiler doesn't complain.
	void throwNullPointerException() {
		throw new NullPointerException();
	}

	public static void main(String[] args) throws NewException {
		HandleOrDeclare hod = new HandleOrDeclare();
		try {
			hod.throwNewException();
		} catch (NewException e) {
			hod.throwNewException();
		} finally {
			hod.throwNullPointerException();
		}
	}
}

// Since NewException extends Exception it is a checked exceptions which is
// subjected to handle or declare rule.
class NewException extends Exception {
}

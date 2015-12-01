package com.oca.revision.demos.exceptions;

import java.io.IOException;

public class ConstructorExceptions {

	// Super constructor throws IOException.
	public ConstructorExceptions() throws IOException {

	}

	public static void main(String[] args) {
		try {
			// When instantiating the checked exceptions thrown by constructors
			// must be either handled or declared
			new ConstructorExceptions();
			new SubConstructorExceptions();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * Constructor must declare all the checked exceptions declared in the base
 * constructor (or the super classes of the checked exceptions). They may add
 * other exception. This behavior is exactly opposite from that of methods. The
 * overriding method cannot throw any exception other than overridden method. It
 * may throw subclasses of those exceptions.
 */
class SubConstructorExceptions extends ConstructorExceptions {

	// Default constructor doesn't declare the checked exception thrown by the
	// implicit
	// super constructor, thus must define an explicit constructor which declare
	// the exception or its super type. Note that the exception thrown by the
	// super constructor cannot be handled within
	// the constructor using try catch blocks since call to super()[or call to
	// this()] must be the first line that appears in a constructor.
	public SubConstructorExceptions() throws Exception {

	}

}

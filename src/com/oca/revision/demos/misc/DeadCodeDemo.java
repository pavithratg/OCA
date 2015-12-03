package com.oca.revision.demos.misc;

public class DeadCodeDemo {

	/*
	 * ref :
	 * http://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.21
	 * 
	 * if(false) { x=3; } does not result in a compile-time error. An optimizing
	 * compiler may realize that the statement x=3; will never be executed and
	 * may choose to omit the code for that statement from the generated class
	 * file, but the statement x=3; is not regarded as "unreachable" in the
	 * technical sense specified here.
	 * 
	 * The rationale for this differing treatment is to allow programmers to
	 * define "flag variables" such as:
	 * 
	 * static final boolean DEBUG = false; and then write code such as:
	 * 
	 * if (DEBUG) { x=3; } The idea is that it should be possible to change the
	 * value of DEBUG from false to true or from true to false and then compile
	 * the code correctly with no other changes to the program text.
	 */

	public static final boolean DEBUG = false;

	public static void main(String[] args) {
		int x = 0;

		/*
		 * ref :
		 * http://stackoverflow.com/questions/2141029/unreachable-code-error
		 * -vs-dead-code-warning-in-java-under-eclipse
		 */
		if (false) {
			x = 3;// Dead code, this is a warning produced by Eclipse, not from
					// JDK, JDK actually eliminates dead code
		}

		if (DEBUG) {
			x = 3;
		}

		System.out.println(x);

		if (true)
			return;
		System.out.println("I'm dead");// Dead code

	}

}

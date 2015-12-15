import java.io.IOException;

public class A {

	/*
	 * ref :
	 * http://stackoverflow.com/questions/9276378/unreachable-code-compiler
	 * -error
	 * 
	 * Unreachable code is meaningless, so the compile-time error is helpful.
	 * The reason why it won’t be detected at the second example is, like you
	 * expect, for testing / debugging purposes. It’s explained in The
	 * Specification:
	 * 
	 * if (false) { x=3; } does not result in a compile-time error. An
	 * optimizing compiler may realize that the statement x=3; will never be
	 * executed and may choose to omit the code for that statement from the
	 * generated class file, but the statement x=3; is not regarded as
	 * "unreachable" in the technical sense specified here.
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

	// A compile time constant.
	public static final boolean DEBUG = false;

	// Not a compile time constant.
	private static final boolean DEBUG_FLAG;

	final boolean flag = false;

	static {
		DEBUG_FLAG = false;
	}

	public static void main(String[] args) {
		


		int x = 0;

		// Unreachable code, thus a compile time error.
		// for (int i = 0; false; i++) {
		// x = 3;
		// }

		for (int i = 0; i < 0; i++) {
			x = 3;
		}

		do {
			x = 3;
		} while (false);

		// Special case of java which doesn't give a compile time error but a
		// warning. Dead code, warning. Condition should be a compile time
		// constant.
		if (false) {
			x = 3;
		}

		if (DEBUG) {
			x = 3;
		}

		// Unreachable code, thus a compile time error.
		// while (false) {
		// x = 0;
		// }

		while (DEBUG_FLAG) {

		}

		if (new A().flag) {

		}

		// while (true) {
		// x = 3;
		// }
		// Unreachable code : compile time error.
		// x=4;

		while (new A().flag) {

		}

	}

	public void foo() {
		System.out.println("Hello");
		if (true)
			return;
		System.out.println("World!");// dead code : warning only
	}

	public void bar(Exception e) {

//		while (flag) {
//
//		}

		if (flag) {
			System.out.println("");
		}

		System.out.println("Hello");
		return;
		// Unreachable code : compile time error
		// System.out.println("World!");
	}
	
//	public void bar(IOException e){}

}

class B extends A{
	
	
	public void bar(IOException e) {
		
	}
	
}

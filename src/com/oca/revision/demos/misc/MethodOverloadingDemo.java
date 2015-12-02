package com.oca.revision.demos.misc;

public class MethodOverloadingDemo {

	/*
	 * 1. The compiler always tries to choose the most specific method available
	 * with least number of modifications to the arguments.
	 * 
	 * 2. Java designers have decided that old code should work exactly as it
	 * used to work before boxing-unboxing functionality became available.
	 * 
	 * 3. Widening is preferred to boxing/unboxing (because of rule 2), which in
	 * turn, is preferred over var-args
	 */

	void test(int... i) {
		System.out.println("params varagrs");
	}

	void test(Integer i) {
		System.out.println("param Integer");
	}

	void test(long l) {
		System.out.println("param long");
	}

	void test(Long l) {
		System.out.println("param Long");
	}

	public static void main(String[] args) {

		MethodOverloadingDemo mod = new MethodOverloadingDemo();

		/*
		 * test(int) is bound to test(long) (because of Rule 2) , then to
		 * test(Integer ) because boxing an int qives you an Integer, which
		 * matches exactly to test(Integer), and then to test(int...).
		 * 
		 * It is never bound to test(Long) because int is not compatible with
		 * Long.
		 */
		int x = 4;
		mod.test(x);

		/*
		 * test(Integer) is bound to test(Integer) (exact match), then with
		 * test(long), then with test(int...) in that order of preference.
		 * 
		 * test(long) is preferred over test(int...) because unboxing an Integer
		 * gives an int and in pre 1.5 code test(long) is compatible with an int
		 * (Rule 2).
		 * 
		 * It is never bound to test(Long) because Integer and Long are
		 * different object types and there is no IS-A relation between them.
		 * (This holds true for any two wrapper classes). It could, however, be
		 * bound to test(Object ) (if it existed), because Integer IS-A Object.
		 */
		Integer i = 4;
		mod.test(i);

	}

}

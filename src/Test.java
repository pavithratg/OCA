public class Test {

	public static int[] getArray() {
		return null;
		// new int[]{1,2,3};
	}

	public static void main(String[] args) {

		int index = 1;

		/*
		 * In an array access, the expression to the left of the brackets
		 * appears to be fully evaluated before any part of the expression
		 * within the brackets is evaluated. Note that if evaluation of the
		 * expression to the left of the brackets completes abruptly, no part of
		 * the expression within the brackets will appear to have been
		 * evaluated.
		 */

		/*
		 * first index = 2 will be executed, which assigns 2 to index. After
		 * that null[2] is executed, which throws a NullPointerException. But
		 * this exception is caught by the catch block, which prints nothing. So
		 * it seems like NullPointerException is not thrown but it actually is.
		 */
		try {
			getArray()[index = 2]++;
		} catch (Exception e) {
		}

		System.out.println("index = " + index);

	}
}

public class Test {

	final int a = 20;
	
	double d = 3.5f;

	public static void main(String[] args) {
		System.out.println("hello".concat(" world").trim()
				.equals("hello world"));
		System.out.println("Hello World".toLowerCase().equals("hello world"));
		System.out.println("hello world".compareTo("Hello World"));

		int[][] arr = new int[][] { {}, {} };

		int[] ar = {};
		int[][] ar2 = { ar, { 6, 5 }, ar };
		int[][][] ar3 = { ar2 };

		int i = 0;

		meth(i++);

	}

	static void meth(int i) {
		System.out.println(i);
	}

}

class SubTest extends Test {

	public static void main(String[] args) {
		//new SubTest().a=30;
	}

}

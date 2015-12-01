import static java.lang.Integer.MAX_VALUE;

public class Test {

	String s = this.toString();
	byte b = 0;
	double d = 43e1;

	int x = 7 * 30 / 100;

	public static void main(String[] args) {
//		int i = 0;
//		int var = 1;
//		while (true) {
//			System.out.println(i + " " + var);
//			if (i++ == var)
//				break;
//		}
		
		int x = 5;
		int i = (x=3) * 4;
		
		Test t = new Test();
		t.b--;
		int b = MAX_VALUE;
		// System.out.println(t.x);
	}

	// int i = 10;
	//
	// Test(int i) {
	// this.i = i;
	// }
	//
	// {
	// i = 50;
	// }
	//
	// public static void main(String[] args) {
	// System.out.println(new Test(30).i);
	// }
	//
	// {
	// i = 100;
	// }

	// public static void main(String[] args) {
	// int[] scores = { 1, 2, 3, 4, 5, 6};
	// System.arraycopy(scores, 2, scores, 3, 2);
	// for(int i : scores) System.out.print(i);
	//
	// }

}

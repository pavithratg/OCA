public class Test {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = false;
		boolean c = false;

		boolean d = (a = true) || (b = false) && (c = true);

		System.out.println(a + " " + b + " " + c);

	}

}

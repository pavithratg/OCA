public class A {

	static char[] charArr = { 'g', 'o', 'o', 'd' };

	static String string = "good";
	String newString = null;

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();

		System.out.println("a1.newString at beginning= " + a1.newString);
		System.out.println("a2.newString at beginning= " + a2.newString);

		for (char c : charArr) {
			// Handling the null
			if (a1.newString == null)
				a1.newString = "" + c;
			else
				a1.newString += c;

			// Not handling the null, in this case a2.newString's initial value
			// null would be included in the result
			a2.newString += "" + c;
		}

		System.out.println((string == a1.newString) + " "
				+ string.equals(a1.newString));
		System.out.println("a1.newString at end= " + a1.newString);

		System.out.println((string == a2.newString) + " "
				+ string.equals(a2.newString));
		System.out.println("a2.newString at end= " + a2.newString);

	}

}

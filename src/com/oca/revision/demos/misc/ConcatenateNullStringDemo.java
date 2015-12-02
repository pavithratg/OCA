package com.oca.revision.demos.misc;

public class ConcatenateNullStringDemo {

	static char[] charArr = { 'g', 'o', 'o', 'd' };

	static String string = "good";
	String newString = null;

	public static void main(String[] args) {

		ConcatenateNullStringDemo a1 = new ConcatenateNullStringDemo();
		ConcatenateNullStringDemo a2 = new ConcatenateNullStringDemo();

		System.out.println("a1.newString at beginning= " + a1.newString);
		System.out.println("a2.newString at beginning= " + a2.newString);

		for (char c : charArr) {
			// Handling null
			if (a1.newString == null)
				a1.newString = "" + c;
			else
				a1.newString += c;

			// Not handling null, in this case a2.newString's initial value
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

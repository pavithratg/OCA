package com.oca.revision.demos.casting;

public class PrimitiveClastingDemo {

	public static void main(String[] args) {

		/*
		 * ref :
		 * http://stackoverflow.com/questions/27895773/confused-about-the-idea
		 * -of-implicit-narrowing-on-primitives-in-java
		 * 
		 * The rules are different for assignment and method calls (including
		 * constructors) for literals.
		 * 
		 * Java only has 6 literal types: IntegerLiteral, FloatingPointLiteral,
		 * BooleanLiteral, CharacterLiteral, StringLiteral, and NullLiteral.
		 * 
		 * Suffice it to say that integer literals are implicitly downcast to
		 * byte, char,short and int as appropriate during assignment.
		 * 
		 * Implicit narrowing occurs only for byte, char, short, and int.
		 * Remember that it does not occur for long, float, or double. So, this
		 * will not compile: int i = 129L; An integer literal is of type long if
		 * it is suffixed with an ASCII letter L or l (ell); otherwise it is of
		 * type int (§4.2.1).
		 */

		new Byte((byte) 3);// if we do not cast this would not be compiled.

		byte b = 10;
		char c = 'a';
		short s = 15;
		final short sh = 10;
		final short sho = 200;
		int i = 100;
		long l = 50l;
		float f = -1.5f;
		double d = -2.5;

		/*
		 * Conversion from short to char needs a cast. The reverse is also true.
		 * Because their ranges are not compatible.
		 * 
		 * short VARIABLE can NEVER be assigned to a char without explicit
		 * casting.
		 * 
		 * A short CONSTANT can be assigned implicitly to a char only if the
		 * value fits into a char.
		 */
		char cc = (char) s;
		short ss = (short) c;

		// This is fine because s is a constant and the value fits into a char.
		cc = sh;

		/*
		 * Conversion from byte to char needs a cast. The reverse is also true.
		 * Because their ranges are not compatible.
		 */
		cc = (char) b;
		byte bb = (byte) c;

		cc = (char) i;
		int ii = c;

		bb = (byte) i;
		ii = b;

		ss = (short) i;
		ii = s;

		bb = (byte) s;
		// This is fine because sh is a constant and the value fits into a byte.
		bb = sh;
		// Has to cast because although s is a constant, the value is too large
		// to fit into a byte.
		bb = (byte) sho;
		ss = b;

		ii = (int) l;
		long ll = i;

		/********************************************************************/

		/*
		 * ref :
		 * http://stackoverflow.com/questions/27895773/confused-about-the-idea
		 * -of-implicit-narrowing-on-primitives-in-java
		 * 
		 * In addition, if the expression is a constant expression (§15.28) of
		 * type byte, short, char, or int: An IMPLICIT narrowing primitive
		 * conversion may be used if the type of the variable is byte, short, or
		 * char, and the value of the constant expression is REPRESENTABLE in
		 * the type of the variable.
		 * 
		 * '&' is precisely a constant expression of type byte, short, char, or
		 * int.
		 */
		char c1 = '&';
		byte b1 = (byte) c1;
		short s1 = (short) c1;
		int i1 = c1;

		byte bc = '&';
		short sc = '&';
		int ic = '&';
		System.out.println(bc); // Correctly displays number 38 on the console
		System.out.println(sc); // Correctly displays number 38 on the console

		byte bt = (byte) '&';
		System.out.println(bt); // Correctly displays number 38 on the console

	}

}

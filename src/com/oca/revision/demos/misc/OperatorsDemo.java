package com.oca.revision.demos.misc;

/*
 * All operands of type byte, char or short are promoted 
 * AT LEAST to an int before performing mathematical operations. 
 * If one of the operands is larger than an int then the other one
 * is promoted to the same type.
 */
public class OperatorsDemo {

	public static void main(String[] args) {

		/*
		 * operator + is left associative so evaluation of (1 + 2 + "3" ) is as
		 * follows: ( 1 + 2 ) + "3" -> 3 + "3" -> "33".
		 */
		System.out.println(1 + 2 + "3");

		/*
		 * evaluation of ("1" + 2 + 3) is as follows: ("1" + 2) + 3 -> "12" + 3
		 * -> "123".
		 */
		System.out.println("1" + 2 + 3);

		/*
		 * (4 + 1.0f ) evaluates as 4.0f + 1.0f ->5.0f -> 5.0
		 */
		System.out.println(4 + 1.0f);

		/*
		 * (5/4) performs integer division because both 5 and 4 are integers,
		 * resulting in the value 1.
		 * 
		 * Note that System.out.println((float)5/4); will print 1.25. If you
		 * remove the explicit cast (float), it will print 1.
		 */
		System.out.println(5 / 4);

		/*
		 * Both operands in the expression ( 'a' + 1 ) will be promoted to int
		 * => 97 + 1 = 98
		 */
		System.out.println('a' + 1);

	}

}

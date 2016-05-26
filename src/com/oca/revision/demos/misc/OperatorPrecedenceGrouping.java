package com.oca.revision.demos.misc;

public class OperatorPrecedenceGrouping {

	/*
	 * Expressions are evaluated left to right. Parenthesis just express
	 * grouping, they don't express order of evaluation.
	 */

	/*
	 * The evaluation of an arithmetical expression is controlled by three sets
	 * of rules: precedence rules, associativity rules, and order rules.
	 * 
	 * Precedence rules describe how an underparenthesized expression should be
	 * parenthesized when the expression mixes different kinds of operators.
	 * 
	 * Associativity rules describe how an underparenthesized expression should
	 * be parenthesized when the expression has a bunch of the same kind of
	 * operator.
	 * 
	 * Order of evaluation rules describe the order in which each operand in an
	 * expression is evaluated.
	 * 
	 * Higher precedence results in grouping of operands with an operator and
	 * doesn't mean the evaluation of operands. It is the order of evaluation
	 * which decides sequence of evaluation of sub-expressions in an expression.
	 */

	public static void main(String[] args) {

		// Example 1:
		boolean a = false;
		boolean b = false;
		boolean c = false;

		boolean d = (a = true) || (b = false) && (c = true);

		/*
		 * Note: Short circuit operator || doesn't evaluate right hand side
		 * operand if the left hand side operand is already true.
		 */
		System.out.println(a + " " + b + " " + c);

		// Example 2:
		int i = 10;
		/*
		 * Expressions are evaluated left to right. Parenthesis just express
		 * grouping, they don't express order of evaluation.
		 */

		/*
		 * Note: prefix operator increments the variable value before it is used
		 * in the expression. postfix operator increments the variable value
		 * after it is used in the expression.
		 */
		i = ++i * (++i + 5);
		System.out.println("i: " + i);

		// Example 3: This fails to compile if we don't group with parenthesis.
		d = a != (b = !c);

		// Example 4:
		int k = 1;

		/*
		 * Expressions are evaluated left to right. Parenthesis just express
		 * grouping, they don't express order of evaluation.
		 */

		/*
		 * Following expression is as same as [k = k + (k=4) * (k+2)] ; first
		 * k's value of 1 is kept aside and (k=4) is evaluated. The sub
		 * expression (k=4) assigns 4 to k and the whole sub expression returns
		 * the value 4. After that sub expression (k+2), is evaluated, note that
		 * the current value of k is now 4, therefore the whole sub expression
		 * returns the value 6. Considering the operator precedence * evaluated
		 * before +, thus 4 and 6 are multiplied first and the result 24 and the
		 * value 1 are added together and the final result 25 is assigned back
		 * to variable k.
		 */
		k += (k = 4) * (k + 2);
		System.out.println("k: " + k);

		// Example 5:
		boolean b1 = false;
		int i1 = 2;
		int i2 = 3;

		/*
		 * The expression b1 = i1 == i2 will be evaluated as b1 = (i1 == i2)
		 * because == has higher precedence than =. Further, all an if statement
		 * needs is a boolean. Now i1 == i2 returns false which is a boolean and
		 * since b1 = false is an expression and every expression has a return
		 * value (which is actually the Left Hand Side of the expression), it
		 * returns false which is again a boolean. Therefore, in this case, the
		 * else condition will be executed.
		 */
		if (b1 = i1 == i2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}

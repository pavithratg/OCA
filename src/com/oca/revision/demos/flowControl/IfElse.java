package com.oca.revision.demos.flowControl;

public class IfElse {

	/*
	 * The else id belong to the closest if that doesn't have an else.
	 */

	void ifElseTest(boolean flag) {
		if (flag) // 1

			if (flag) // 2

				if (flag) // 3

					System.out.println("False True");

				else
					// 4

					System.out.println("True False");

			else
				// 5

				System.out.println("True True");

		else
			// 6

			System.out.println("False False");

	}

}

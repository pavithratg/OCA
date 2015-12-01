package com.oca.revision.demos.flowControl;

public class GoodExamplefor {

	static boolean flag = true;

	public static void main(String[] args) {
		if (flag = false) {
			System.out.println(1);
		} else if (flag) {
			System.out.println(2);
		} else if (!flag) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

}

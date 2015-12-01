package com.oca.revision.demos.arrays;

public class ArrDemo {

	char c = 'a';
	short s = 2;
	byte b = 3;

	// Creating an Array : Method 1

	// Declaring and constructing an array
	int[] arr = new int[2];

	// Creating an Array : Method 2
	int[] arr2 = { 3, 5 };

	// just in time array
	int i = new int[] { 3, 5 }[1];

	int[] impArr = { 5, c, s, b };

	float[] fa = { 1.1f, -124, 65, 65l, 0547, 0b010, 0x67a, 100_000, c, s, b };

	byte[] ba = { 3, 7, 9 };

	// Creating an 2d array : method 1
	int[][] arr2d = new int[2][];
	int[][] arr2d2 = new int[2][3];

	// Creating an 2d array : method 2
	int[][] arr2d3 = { { 1, 3, 5 }, { 2, 4 } };

	public static void main(String[] args) {
		ArrDemo ad = new ArrDemo();
		// Populating an array
		ad.arr[0] = 3;
		ad.arr[1] = 5;

		// Arrays containing object types, can contain their sub types
		ArrDemo[] arrDemo = { new ArrDemo(), new SubArrDemo() };
		SubArrDemo[] subArrDemo = { new SubArrDemo(), new SubArrDemo() };

		// super type array reference can refer to a sub type array. This is
		// valid for object type arrays only, for primitives this is not valid,
		// for instance int array reference cannot reference a byte array.
		arrDemo = subArrDemo;
		arrDemo[0].getStatus();

		// ad.arr = ad.ba;
		
		// arrays have a built in property to determine its length.
		int len = ad.arr.length;
		System.out.println(len);

	}

	void getStatus() {
		System.out.println("in super");
	}

}

class SubArrDemo extends ArrDemo {

	void getStatus() {
		System.out.println("in sub");
	}

}

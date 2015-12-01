package com.oca.revision.demos.constructors;

class Super {

	Super() {
		print();
	}

	void print() {
		System.out.println("Super");
	}

}

public class Sub extends Super {

	int i = 4;

	@Override
	void print() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		Super s = new Sub();
		s.print();
	}

}

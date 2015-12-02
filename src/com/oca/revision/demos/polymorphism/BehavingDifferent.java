package com.oca.revision.demos.polymorphism;

public class BehavingDifferent {

	public static void main(String[] args) {
		Super s = new Sub();
		((Sub) s).printHello();
		((In) s).printHello();
	}

}

class Super {
}

class Sub extends Super implements In {

	@Override
	public void printHello() {
		System.out.println("hello");

	}

}

interface In {
	void printHello();
}

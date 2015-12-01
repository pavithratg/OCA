package com.oca.revision.demos.classesNInterfaces;

// abstract classes cannot be instantiated.
public abstract class AbstractClassDemo {

	public abstract void printState();

	public void print() {
		System.out.println("printing...");
	}

	public static void main(String[] args) {

		new SubSubClassDemo().printState();
	}

}

abstract class SubClassDemo extends AbstractClassDemo {

	@Override
	public void print() {
		System.out.println("Printing subclass...");
	}

	public int getInt() {
		return 10;
	}

	public abstract float getFloat();

}

class SubSubClassDemo extends SubClassDemo {

	@Override
	public void printState() {
		System.out.println("Printing concrete state...");
	}

	@Override
	public float getFloat() {
		return 10.98f;
	}

}

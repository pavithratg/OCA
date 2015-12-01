package com.oca.revision.demos.polymorphism;

/*
 * When the return type of the overridden method is a primitive it 
 * cannot be changed into another type in the overriding method.
 * 
 * When the return type of the overridden method is an object type,
 * the return type of the overriding method can be a sub type of that object type. 
 * 
 * method parameter types cannot be changed for either primitive or an object types. 
 * */

public class A {

	private A a;

	A setI(B b) {
		return new A();
	}

	public static void main(String[] args) {
		B b = new B();
		b.setI(new B());

	}

}

class B extends A {

	private A a;

	B setI(B a) {
		System.out.println("in the sub class");
		return new B();

	}

}

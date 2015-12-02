package com.oca.revision.demos.polymorphism;

public class ToStringOverridingDemo {

	public static void main(String[] args) {
		Object a;
		a = new String("A");

		/*
		 * The Object class's toString generates a string
		 * using:  getClass().getName() + '@' + Integer.toHexString(hashCode())
		 * But in this case, String class overrides the toString() method that
		 * returns just the actual string value.
		 * 
		 * When using objects in println method, their toString method will be
		 * executed. Note that for object references referring to null, toString
		 * will not be invoked on them just null will be resulted and be
		 * printed, so no NullPointerException will be thrown.
		 * 
		 * At compile time compiler checks whether reference class, which is
		 * Object which has toString method, if it doesn's it will complain. In
		 * runtime JVM executes the overriding method in actual object, since
		 * String class extends from Object class, and it has overridden the
		 * toString method, String class's toString method will be executed
		 * during the runtime, not Object class's toString.
		 */
		System.out.println(a);
	}

}

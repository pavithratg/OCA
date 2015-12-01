package com.oca.revision.demos.misc;

class Super {

	static void sayHello() {
		
		System.out.println("In Super static method");

	}

	/*
	 * You cannot have two methods with the same signature (name and parameter
	 * types) in one class.
	 */

	// void sayHello(){
	//
	// }

}

class Sub extends Super {

	/*
	 * even if you put one sayHello() method in other class which is a subclass
	 * of this class, it won't compile because you cannot override/hide a static
	 * method with a non static method and vice versa.
	 */

	// void sayHello(){
	//
	// }

	// int sayHello(){
	//
	// }

	/*
	 * Can shadow(hide) super class static method in the sub class, note that
	 * this is not overriding the method just shadowing.
	 */
	static void sayHello() {
		
		System.out.println("In Sub static method");

	}

}

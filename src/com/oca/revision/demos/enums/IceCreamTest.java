package com.oca.revision.demos.enums;

/*
 * Enums can only be declared outside of a class as a separate class or within a class, 
 * enum cannot be declared within a method.
 * */

class IceCream {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	};// Semicolon is optional

	Flavors flavor;
}

public class IceCreamTest {

	public static void main(String[] args) {

		IceCream iceCream = new IceCream();
		// Enclosing class name is required. Note that syntax for accessing an
		// enums depend on where they are declared.
		iceCream.flavor = IceCream.Flavors.CHOCOLATE;

	}

}

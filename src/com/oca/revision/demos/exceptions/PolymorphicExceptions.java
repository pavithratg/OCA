package com.oca.revision.demos.exceptions;

public class PolymorphicExceptions {

	public void play() throws Exception {
		System.out.println("in super");
	}

	public static void main(String[] args) {

		PolymorphicExceptions pe = new SubPoly();
		// In a polymorphic declaration, at the compiler time, compiler choose
		// the reference type method, at runtime the overridden method of the
		// actual method is chosen. Therefore if we do not handle or declare the
		// checked exception thrown by the reference type method compiler will
		// complain, even though the actual object's overridden method doesn't
		// throw any checked exceptions.
		try {
			pe.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class SubPoly extends PolymorphicExceptions {

	public void play() {
		System.out.println("in sub");
	}

}

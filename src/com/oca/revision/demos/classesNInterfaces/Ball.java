package com.oca.revision.demos.classesNInterfaces;

/*Typing abstract modifier is redundant, because interfaces are implicitly abstract*/
abstract interface Bounceable {
	/*
	 * Doesn't necessarily have to type public static final modifiers, since
	 * they are implicitly added by the compiler even if we don't
	 */
	public static final String NAME = "Ball";

	int s = 0;

	/*
	 * Doesn't necessarily have to type public abstract modifiers for interface
	 * methods, since they are implicitly added by the compiler even if we
	 * don't.
	 * 
	 * interface methods cannot be static
	 * 
	 * interface methods cannot have final, strictfp, native modifiers. If you
	 * add final modifier to an interface method, it means it cannot be
	 * overridden which contradicts the true intention of interface methods
	 */
	public abstract void bounce();

	void setBounceFactor(int bf);

}

/*
 * class Ball is abstract since it doesn't implement all the methods in
 * /Bounceable interface, also it has a new abstract method getColor() on its
 * own
 */
public abstract class Ball implements Bounceable {

	int bf;

	@Override
	public void bounce() {
		System.out.println("Bouncing Ball");

	}

	// new abstract method has been added
	public abstract String getColor();

	// new concrete method
	public void printState() {
		System.out.println("printing inside Ball...");
	}

}

/*
 * Concrete subclass implements all the abstract methods and has its own
 * concrete methods
 */
class BascketBall extends Ball {
	@Override
	public void bounce() {
		System.out.println("Bouncing Bascketball");
	}

	@Override
	public void setBounceFactor(int bf) {
		this.bf = bf;

	}

	@Override
	public String getColor() {
		return "Orange";
	}

	// inherited concrete method
	@Override
	public void printState() {
		System.out.println("printing inside Bascketball...");
	}

	// concrete method
	public void printweight() {
		System.out.println("3 pounds!");
	}
}

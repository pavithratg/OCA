package com.oca.revision.demos.methods;

public class OverloadingDemo {

	public void doStuff(Animal a) {
		System.out.println("do what animals do");
	}

	public void doStuff(Horse h) {
		System.out.println("do what horses do");
	}

	public static void main(String[] args) {

		OverloadingDemo od = new OverloadingDemo();
		Animal animal = new Animal();
		Horse horse = new Horse();
		od.doStuff(animal);
		od.doStuff(horse);

		// Here at compile time compiler doesn't aware of the actual object, the
		// reference points to. Compiler only aware of the reference type and it
		// makes the decision of choosing the overloading method based on the
		// reference, not the actual object.
		Animal newHorse = new Horse();

		/**
		 * Note that unlike in overriding, which overloading method to run is
		 * decided by COMPILER at COMPILE TIME by looking at the REFERENCE type.
		 * Compiler checks if the reference class has that method, if not it
		 * will give a compile time error. So it doesn't matter which object the
		 * reference actually points to.
		 */
		od.doStuff(newHorse);

	}

}

class Animal {
}

class Horse extends Animal {
}
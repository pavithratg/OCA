package com.oca.revision.demos.misc;

public class InstanceOfDemo {

	public static void main(String[] args) {

		Flyer f = new Eagle();
		Eagle e = new Eagle();
		Bat b = new Bat();
		Butterfly bf = new Butterfly();

		if (f instanceof Bird)
			System.out.println("f is a Bird");
		if (e instanceof Flyer)
			System.out.println("e is a Flyer");

		/*
		 * there is no compilation issue with b instanceof Flyer because Flyer
		 * is an interface and it is possible for b to point to an object of a
		 * class that is a sub class of Bat and also implements Flyer. So the
		 * compiler doesn't complain.
		 */
		if (b instanceof Flyer)
			System.out.println("b is a Flyer");
		/*
		 * does not compile since Bat and Bird are not in the same class
		 * heirachy.
		 */
		// if(b instanceof Bird) System.out.println("b is a Bird");

		/*
		 * does not compile because the compiler knows that it is not possible
		 * for bf to point to an object of a class that implements Flyer. Since
		 * it is final it cannot be subclassed.
		 */
		// if(bf instanceof Flyer) System.out.println("bf is a Flyer");

	}

}

interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}

final class Butterfly {
}

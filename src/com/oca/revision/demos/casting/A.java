package com.oca.revision.demos.casting;

interface I {
}

public class A implements I {

	A a = new A();
	B b = new B();

	A c = new C();

	void cast() {

		// legal up casting, compiles fine, runs fine
		I i = a;
		i = b;
		i = (I) a;
		i = (I) b;

		a = b;
		a = (A) b;

		a = (B) (I) b;
		b = (B) (A) b;

		b = (B) c;

		// Down cast, compiles fine, but fails at runtime throwing a ClassCast
		// Exception. Compiler doesn't complain about down castings that are on
		// the same class hierarchy, but it's the runtime checks the actual
		// object type can be casted to the specific type. The better way to do
		// this down casting is to perform an instance of testing before down
		// casting.
		a = (B) a;

		if (a instanceof B) {
			a = (B) a;
		}

		i = (C) a;// fails at runtime
		a = (B) (I) a;// fails at runtime

	}

}

class B extends A {
}

class C extends B {
}

//relates to a sample question.
class X {
	B getB() {
		return new B();
	}
}

class Y extends X {
	protected C getB() {
		return (C) new B();// compiles fine but throws a ClassCastException at
							// runtime, since a B instance cannot cast to a C
							// instance
	}
}

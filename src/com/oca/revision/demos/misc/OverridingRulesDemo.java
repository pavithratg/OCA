package com.oca.revision.demos.misc;

public class OverridingRulesDemo {

}

class A {

	A doSomething() {
		return new A();
	}

	int doSomethingElse(int x, float y) {
		return (int) (x + y);
	}
}

class B extends A {

	/*
	 * An overriding method is allowed to change the return type to any subclass
	 * of the original return type, also known as covariant return type. This
	 * does not apply to primitives, in which case, the return type of the
	 * overriding method must match exactly to the return type of the overridden
	 * method.
	 */
	@Override
	B doSomething() {
		return new B();
	}

	@Override
	int doSomethingElse(int x, float y) {
		return 'a';
	}
}

package com.oca.revision.demos.variables;

public class VarVisibility {

	public static void main(String[] args) {
		C c = new C();
		A a = new B();// 1

		// Note that although line 1 is a polymophic declaration, polymorphism
		// doesn't apply to variables, runtime method invocation connected with
		// polymophism only applied to overridden methods.
		System.out.println(a.i);

		// For class B and class C, A's private variable x is not accessible
		// through inheritance or through A's reference. For class C, B's
		// private variable i is not
		// accessible through inheritance or B's reference.

		// System.out.println(c.i);
		// System.out.println(c.x);
		System.out.println(c.k);

	}

}

class A {
	public int i = 10;
	private int x = 20;
}

class B extends A {
	private int i = 30;
	public int k = 40;

}

class C extends B {
}

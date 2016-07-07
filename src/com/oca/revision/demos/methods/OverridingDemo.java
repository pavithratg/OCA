package com.oca.revision.demos.methods;

/**
 * 
 * A virtual call means that the call is bound to a method at run time and not
 * at compile time.
 * 
 * In Java, all non-private and non-final instance method calls are virtual.
 * This is important because, at run time, a reference variable may point to an
 * instance of a subclass of the class of the reference.  The compiler doesn't
 * have the knowledge of the class of the actual object being referred to by the
 * reference variable. If the subclass overrides the method, the call becomes
 * polymorphic because now there are two versions of the method that can be
 * invoked (the base class version and the subclass version). Therefore, the
 * compiler is unable to bind the call to the method of a specific class. Only
 * the JVM has the necessary information to bind the call.  The JVM knows the
 * class of the actual object and it binds the call to the method of that class.
 * This behavior is called polymorphism.
 * 
 * Thus, in Java, all non-private and non-final instance method calls are
 * potentially polymorphic because there could be multiple versions of the
 * method eligible to be invoked.
 *
 */

public class OverridingDemo {

	private int state = 1;

	public int getState() throws NumberFormatException {
		return state;
	}

	OverridingDemo getDemo() {
		return new OverridingDemo();
	}

	public static void main(String[] args) {
		/**
		 * Polymorphic method invocation, AT COMPILE TIME, COMPILER checks if
		 * the REFERENCE class has the getState method, if not gives a compile
		 * time error. AT RUNTIME, JVM checks for the getState method of the
		 * ACTUAL OBJECT which bounds to the reference, and execute that method,
		 * this is virtual method invocation.
		 **/
		OverridingDemo od = new SubOverridingDemo();
		System.out.println(od.getState());
	}

}

class SubOverridingDemo extends OverridingDemo {

	private int state = 0;

	/**
	 * In case of overriding, the return type of the overriding method must
	 * match exactly to the return type of the overridden method if the return
	 * type is a primitive.
	 * 
	 * In case of objects, the return type of the overriding method may be a
	 * subclass of the return type of the overridden method.
	 * 
	 * The access modifier of the overriding method must be same or less
	 * restrictive of the access modifier of the overridden method.
	 * 
	 * The exceptions thrown from the overriding method must be few(a subset,
	 * can be zero) or narrower of the exceptions thrown by the overridden
	 * method. There must not be new or broader exceptions present in the
	 * overriding method.
	 * 
	 * Parameter list of the overriding method must exactly match with the
	 * parameter list of the overridden method.
	 */
	@Override
	public int getState() {
		return state;
	}

	/**
	 * 
	 */
	@Override
	public SubOverridingDemo getDemo() {
		return new SubOverridingDemo();
	}

}

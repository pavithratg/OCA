/*
 * final is a valid modifier for the standard main method. 
 * Note that final means a method cannot be overridden. 
 * Although static methods can never be overridden.
 * (they can be shadowed), making a static method final prevents
 * the subclass from implementing the same static method.
 */

/*
 * Observe that the given code does not follow the standard 
 * Java naming convention. The class names should start with a capital letter.
 */
class main {

	final public static void main(String[] args) {

		System.out.println("main method in class main");
		
		anotherClass.main(new String[]{});

	}

}

class anotherClass {

	public static void main(String[] args) {

		System.out.println("main method in class another class");

	}

}

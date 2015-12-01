class Alpha {
	String getType() {
		return "alpha";
	}
}

class Beta extends Alpha {
	String getType() {
		return "beta";
	}
}

public class Gamma extends Beta {
	String getType() {
		return "gamma";
	}

	public static void main(String[] args) {
		Gamma g1 = (Gamma) new Alpha();// Although this downcast is allowed at
										// the compile time. Since the actual
										// object at runtime is not a type alpha
										// a runtime exception
										// classCastException will be thrown by
										// the JVM.
		Gamma g2 = (Gamma) new Beta();
		System.out.println(g1.getType() + " " + g2.getType());
	}
}

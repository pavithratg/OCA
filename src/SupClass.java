public class SupClass {
	
	public SupClass() {
		
		A a1 = new C();
		C c1 = (C) a1;
		
	
		
	}
	
	
	
	class A implements I {
		
	}
	
	class B extends A {
		
	}
	
	class C extends B {
		
	}
}

interface I {
	
}




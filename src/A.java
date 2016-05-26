public class A extends B {
	
	static{
		i = 15;
		System.out.println("sub i: "+i);
		System.out.println("sub static init block");
	}
	
	{
		System.out.println("sub init block");
		//i = 15;
		System.out.println("sub "+ i);
	}
	
	A(){
		i = 20;
		System.out.println("inside sub constructor "+ i);
	}

	public static void main(String[] args) {
		new A();
	}
	
}

class B{
	
static int i = 10;
	
	static{
		System.out.println("super i: "+ i);
		System.out.println("super static init block");
	}
	
	{
		System.out.println("super init block");
		//i = 15;
		System.out.println("super "+ i);
	}
	
	B(){
		i = 20;
		System.out.println("inside super constructor "+ i);
	}
	
}

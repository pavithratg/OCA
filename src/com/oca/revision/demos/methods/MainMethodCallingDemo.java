package com.oca.revision.demos.methods;

/*
 * It is quite interesting to know whether classes other than the 
 * public class within a same package can have the super power main method.
 * If this was other way round it would give an ArrayOutOfBoundException... 
 * */

public class MainMethodCallingDemo {
	public static void main(String[] args) {
		NotThePublicClass.main(new String[]{"Hi", "There!"});
	}

}

class NotThePublicClass {
	public static void main(String[] args) {
		System.out.println(args[0]+ " " +args[1]);
	}
}

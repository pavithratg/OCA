package com.oca.revision.demos.variables;

public class VarModifierDemo {
	
	public int i;
	static int si=10;
	
	int getInt(int arg0, final int arg1){
		return 10;
	}
	
	static void printState(int arg0, final int arg1){
		System.out.println("printing...");
	}
	
	//native methods doesn't have a method body
	static native void getNative();
	
	public VarModifierDemo() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}

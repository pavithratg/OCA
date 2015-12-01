package com.oca.revision.demos.classesNInterfaces;

public final class PrivateClassDemo {
	
	static int size;
	
	private PrivateClassDemo(int s){
		size = s;
	}
	
	public static int getSize(){
		return size;
	}
	
	public static void setSize(int s){
		size = s;
	}
	
}

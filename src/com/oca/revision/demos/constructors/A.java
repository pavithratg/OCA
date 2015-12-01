package com.oca.revision.demos.constructors;

class SuperA{
	
	int a = 10; //3
	
	SuperA(int a){
		this.a = a;//5
		System.out.println(this.a);
	}
	
	{//4
		a = 30;
	}
	
	static{//1
		System.out.println("Inside Super Static Block");
	}
	
}

public class A extends SuperA{
	
	int b = 20;//6
	
	A(int b){
		super(b);
		this.b = b + 10;//8
		System.out.println(this.b);
	}
	
	{//7
		b = 40;
	}
	
	static{//2
		System.out.println("Inside Sub Static Block");
	}
	
	public static void main(String[] args) {
		A obj = new A(50);
		
	}
}

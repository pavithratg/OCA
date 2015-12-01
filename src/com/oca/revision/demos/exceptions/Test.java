package com.oca.revision.demos.exceptions;

class SomeException extends Exception{}
class MyException extends SomeException{}

public class Test {
	
	public static void main(String[] args) throws SomeException{
		try {
			m1();
		} catch (SomeException e) {
			throw e;
		}finally{
			System.out.println("Done");
		}
	}
	
	static void m1() throws MyException{
		throw new MyException();
	}

}

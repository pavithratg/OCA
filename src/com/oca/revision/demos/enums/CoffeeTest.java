package com.oca.revision.demos.enums;

//Cannot be private or protected, only can be public or default
enum CoffeeSize {
	SMALL, MEDIUM, LARGE
}

class Coffee {
	CoffeeSize size;
}

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.size = CoffeeSize.MEDIUM;// enum outside the class
	}

}

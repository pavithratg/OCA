package com.oca.revision.demos.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add(1,"c");
		
		List<String> al2 = new ArrayList<String>();
		al2 = al.subList(1, 1);// al2 = [] in this case
		
		al.addAll(al2);
		//al.addAll(1, al2);
		
		System.out.println(al);
		
	}

}

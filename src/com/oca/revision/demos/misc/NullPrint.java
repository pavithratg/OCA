package com.oca.revision.demos.misc;

public class NullPrint {

	int i = 0;

	public NullPrint(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		if (i == 0)
			return null;
		return "" + i;
	}

	public static void main(String[] args) {
		NullPrint np = new NullPrint(2);
		NullPrint np2 = new NullPrint(0);

		System.out.println("" + np);
		/*
		 * A feature of print/println methods is that if they get null as input
		 * parameter, they print "null". They do not try to call toString() on
		 * null.
		 * 
		 * No NullPointerException is thrown because no method is called on
		 * null.
		 */
		System.out.println("" + np2);
	}

}

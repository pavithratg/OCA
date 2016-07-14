package com.oca.revision.demos.misc;

public class IslandOfObjects {
	public static void main(String[] args) {
		Lost e1 = new Lost();
		Lost e2 = new Lost();
		Lost e3 = new Lost();

		e1.e = e3;
		e2.e = e1;
		e3.e = e2;

		e1 = null;
		e2 = null;
		e3 = null;

		/* The three lost objects form an island that refers to each other. */

		/*
		 * Before line 15 runs the e3 is the last remaining reference to a
		 * member of island. As long as one reference exists, the entire island
		 * is safe from Garbage Collector, but as soon as the last reference is
		 * lost, the ENTIRE ISLAND(not single objects, all 3 objects) becomes GC
		 * eligible.
		 */
	}

}

class Lost {

	Lost e;

}

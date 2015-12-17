package com.oca.revision.demos.enums;

enum ToddlerShoeSize {
	SMALL(5) {
		// Overriding
		public String getStyle() {
			return "straps";
		}
	},
	MEDIUM(6), LARGE(7);

	ToddlerShoeSize(int index) {
		this.index = index;
	}

	public String getStyle() {
		return "lace";
	}

	private int index;

	public int getIndex() {
		return index;
	}
}

public class ToddlerShoe {

}

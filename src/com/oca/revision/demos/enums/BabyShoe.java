package com.oca.revision.demos.enums;

enum ShoeSize {

	SMALL(1), MEDIUM(2), LARGE(3);

	ShoeSize(int index) {
		this.index = index;
	}

	private int index;

	public int getIndex() {
		return index;
	}

}

public class BabyShoe {

	ShoeSize size;

	public static void main(String[] args) {
		BabyShoe shoe1 = new BabyShoe();
		shoe1.size = ShoeSize.SMALL;

		BabyShoe shoe2 = new BabyShoe();
		shoe2.size = ShoeSize.LARGE;

		System.out.println(shoe1.size.getIndex());

		// Every enum has a static method values(), that returns an array of the
		// enum's values in the order ther declared.
		for (ShoeSize ss : ShoeSize.values()) {
			System.out.println(ss.getIndex());
		}

	}

}

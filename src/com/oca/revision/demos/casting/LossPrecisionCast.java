package com.oca.revision.demos.casting;

public class LossPrecisionCast {

	// When you do the math happening behind the scene in theory, first you need
	// to realize that a long is of length 64 bits and a byte is of length 8
	// bits, therefore to narrow a long into a byte, it has to truncate foremost
	// 54 bits. binary form of 130 is now happen to be 1 0000010, as you can see
	// the first bit which is in other words the sign bit is now 1 which
	// indicates it is a negative number, now to obtain 130 in bytes,
	// we have to do 2's complement for that representations which brings us 1
	// 1111101, note that the sign bit is not affected. Then we have to add 1 to
	// the resulted bit pattern, and that brings us 1 1111110. When we convert
	// this in to Decimal, it brings us -126.

	public static void main(String[] args) {
		long l = 130l;
		byte b = (byte) l;

		System.out.println(b);
	}

}

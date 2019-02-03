package org.nm.dsalgo.problems.bits;

public class Examples {

	public static void main(String[] args) {
		System.out.println("Binary Representation of 1 is ->" + toThirtyTwoBinaryString(1));
		int bits = 'a';
		System.out.println("Char a ->" + bits + ", Binary->" + toThirtyTwoBinaryString(bits)
				+ ", 'a' - 'a' - > " + ('a' - 'a') + ", After left shifting -> " + toThirtyTwoBinaryString(leftShiftOfChar('a')));
		bits = 'b';
		System.out.println("Char b ->" + bits + ", Binary->" + toThirtyTwoBinaryString(bits)
		+ ", 'b' - 'a' - > " + ('b' - 'a') + ", After left shifting -> " + toThirtyTwoBinaryString(leftShiftOfChar('b')));

	}

	public static int leftShiftOfChar(char c) {
		return 1 << (c - 'a');
	}

	public static String toThirtyTwoBinaryString(int arg) {
		String str = Integer.toBinaryString(arg);
		String zeroes = "00000000000000000000000000000000";
		int length = str.length();
		String zeroStr = length < 32 ? zeroes.substring(0, 32 - length) : "";
		return zeroStr + str;
	}
}

package org.nm.util;

public class Util {

	public static void printStringAsChars(String input) {
		int length = input.length();
		for (int i = 0; i < length; i++) {
			System.out.println(input.charAt(i));
		}
	}

	public static void main(String[] args) {
		printStringAsChars("ajx37nyx97niysdrzice4petvcvmcgqn282zicpbx6okybw93vhk782unctdbgmcjmbqn25rorktmu5ig2qn2y4xagtru2nehmsp");
	}
}

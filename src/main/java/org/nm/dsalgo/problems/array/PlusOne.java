package org.nm.dsalgo.problems.array;

//import general.Util;

import java.util.Arrays;

public class PlusOne {

	public int[] plusOne(int[] digits) {
		int[] newDigits = digits;
		boolean addFlag = true;
		int added = 0;
		if (digits != null & digits.length > 0) {
			for (int i = digits.length - 1; i >= 0; i--) {
				if (addFlag) {
					added = digits[i] == 9 ? 0 : digits[i] + 1;
					addFlag = added == 0;
					digits[i] = added;
				}
			}
			if (addFlag) {
				newDigits = new int[digits.length + 1];
				newDigits[0] = 1;
				for (int i = 0; i < digits.length; i++) {
					newDigits[i + 1] = digits[i];
				}
			}
		}
		return newDigits;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PlusOne _int = new PlusOne();
		int[] arr = _int.plusOne(new int[] { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3,
				6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
				1, 1, 7, 4, 0, 0, 6 });
//		Util.printArr(arr);

	}

}

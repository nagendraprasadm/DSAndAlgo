package org.nm.dsalgo.problems.bits;

public class ReverseBits {

	public int reverseBits(int n) {
		int res = 0;

		for (int i = 0; i < 32; ++i) {
			System.out.println("\n");
			int first = n & 1;
			//System.out.print("\t First ->" + first + ", Binary Rep ->" + ReverseBits.toThirtyTwoBinaryString(first));
			int second = 31 - i;
			//System.out.print("\t Second ->" + second);
			res += first << second;
			System.out.println("\tfirst << second ->" + (first << second) + ", Binary Rep ->"
					+ ReverseBits.toThirtyTwoBinaryString(first << second));
			;
			System.out.print("\t res ->" + res);
			n = n >>> 1;
			System.out.print("\t n ->" + n + ", Binary Rep ->" + ReverseBits.toThirtyTwoBinaryString(n));
		}
		System.out.println("\n");
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = -10;
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		/*ReverseBits _isnt = new ReverseBits();
		System.out.println(
				"Binary Representation of MAX_VALUE ->" + ReverseBits.toThirtyTwoBinaryString(Integer.MAX_VALUE));
		System.out.println();

		System.out.println("Binary representation of a -> " + ReverseBits.toThirtyTwoBinaryString(a));
		System.out.println("a  ->" + (a));
		System.out
				.println("Binary representation of a -> " + ReverseBits.toThirtyTwoBinaryString(_isnt.reverseBits(a)));*/
		
		int number = -8;
		System.out.println("-8 Binary representation ->" + toThirtyTwoBinaryString(number));
		System.out.println("-8 >> 1 " + (number >> 1) +" Binary representation ->" + toThirtyTwoBinaryString(number >> 1));
		System.out.println("-8 << 1 " + (number << 1) +" Binary representation ->" + toThirtyTwoBinaryString(number << 1));
		System.out.println("-8 >>> 1 " + (number >>> 1) + "Binary representation ->" + toThirtyTwoBinaryString(number >>> 1));

		System.out.println();
		number = 8;
		System.out.println("8 Binary representation ->" + toThirtyTwoBinaryString(number));
		System.out.println("8 >> 1 " + (number >> 1) +" Binary representation ->" + toThirtyTwoBinaryString(number >> 1));
		System.out.println("8 << 1 " + (number << 1) +" Binary representation ->" + toThirtyTwoBinaryString(number << 1));
		System.out.println("8 >>> 1 " + (number >>> 1) + "Binary representation ->" + toThirtyTwoBinaryString(number >>> 1));
	
	}

	public static String toThirtyTwoBinaryString(int arg) {
		String str = Integer.toBinaryString(arg);
		String zeroes = "00000000000000000000000000000000";
		int length = str.length();
		String zeroStr = length < 32 ? zeroes.substring(0, 32 - length) : "";
		return zeroStr + str;
	}

}

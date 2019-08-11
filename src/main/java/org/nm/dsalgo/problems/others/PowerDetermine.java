package org.nm.dsalgo.problems.others;

public class PowerDetermine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PowerDetermine _inst = new PowerDetermine();
		_inst.isPowerOfTwo(4);

	}

	public boolean isPowerOfTwo(int n) {

		if (n <= 0) {
			return false;
		}
		System.out.println("n -> " + Integer.toBinaryString(n));
		int m = -n;

		// m is completely different with n except the last position of 1.

		// For example if n = 5, i.e., 0000 0101, m would be 1111 1011
		System.out.println("m = -n -> " + Integer.toBinaryString(m));

		m &= n;// m only have the last digit of n to be 1.
		System.out.println("m &= n -> " + Integer.toBinaryString(m));

		return m == n;
	}
}
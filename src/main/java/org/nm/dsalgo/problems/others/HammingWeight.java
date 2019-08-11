package org.nm.dsalgo.problems.others;

public class HammingWeight {

	public int hammingWeight(int n) {
		int count = 0;
		if (n > 0) {
			if (n == 1) {
				return 1;
			}
			long r = 0;
			while (n != 0) {
				r = n % 2;
				if (r == 1) {
					count++;
				}
				n = n / 2;
			}
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 2147483647;
		HammingWeight _inst = new HammingWeight();
		System.out.println(_inst.hammingWeight(n));

	}

}

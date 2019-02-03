package org.nm.dsalgo.problems.bits;

public class CountBits {

	public static void main(String[] args) {
			CountBits _inst = new CountBits();
			int[] a = _inst.countBits(10);
			for(int i=0; i < a.length ; i++){
				System.out.print(a[i]);
				System.out.print("->");
			}
	}

	public int[] countBits(int num) {
		if(num > 0){
			int[] a = new int[num + 1];
			int nextPow = 1;
			int prevPow = 1;
			a[0] = 0;
			for(int i = 1; i<= num ; i++){
				if(i == nextPow){
					a[i] = 1;
					prevPow = nextPow;
					nextPow <<= 1;
				}else{
					a[i] = a[i - prevPow] + 1;
				}
			}
			return a;
		}else{
			return new int[]{0};
		}

	}

}

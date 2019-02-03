package org.nm.dsalgo.problems.others;

public class CanWin {

	public boolean canWinNim(int n) {
		if (n <= 0) {
			return true;
		} else {
			return canWinNim(n, n, true);
		}
	}

	public boolean canWinNim(int n, int currentN, boolean self) {
		if (currentN <= 3) {
			if (self) {
				return true;
			} else {
				return false;
			}
		} else {
			for (int i = 1; i <= 3; i++) {
				if (canWinNim(n, currentN - i, !self)) {
					return true;
				}
			}
			return false;
		}
	}

	public boolean canWinNim1(int n) {
		if (n <= 0) {
			return true;
		} else {
			int[] arr = new int[n + 1];
			for (int i = 0; i <= n; i++) {
				arr[i] = -1;
			}
			return canWinNim1(n, n, true, arr);
		}
	}

	public boolean canWinNim1(int n, int currentN, boolean self, int[] arr) {
		if (arr[currentN] != -1) {
			return arr[currentN] == 1;
		}

		if (currentN <= 3) {
			if (self) {
				arr[currentN] = 1;
				return true;
			} else {
				arr[currentN] = 0;
				return false;
			}
		} else {
			for (int i = 1; i <= 3; i++) {
				if (canWinNim1(n, currentN - i, !self, arr)) {
					if (!self) {
						arr[currentN] = 1;
					}
					return true;
				}
			}
			arr[currentN] = 0;
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CanWin _instance = new CanWin();
/*		System.out.println("1 ->" + _instance.canWinNim(1));
		System.out.println("2 ->" + _instance.canWinNim(2));
		System.out.println("3 ->" + _instance.canWinNim(3));
		System.out.println("4 ->" + _instance.canWinNim(4));
		System.out.println("5 ->" + _instance.canWinNim(5));
		System.out.println("6 ->" + _instance.canWinNim(6));
		System.out.println("7 ->" + _instance.canWinNim(7));
*/		System.out.println("8 ->" + _instance.canWinNim1(8));		

	}

}

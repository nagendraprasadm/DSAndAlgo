package org.nm.dsalgo.sort;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort _inst = new QuickSort();
		String[] a = new String[]{"E","O"};
		_inst.partition(a, 0, a.length-1);
		System.out.println(a[0] +"," + a[1]);

	}

	public int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Comparable v = a[lo];
		while (true) {
			while (a[++i].compareTo(v) < 0) {
				if (i == hi) {
					break;
				}
			}

			while (v.compareTo(a[--j]) < 0) {
				if (j == lo) {
					break;
				}
			}

			if (i >= j) {
				break;
			}

			exchange(a, i, j);
		}
		exchange(a, lo, j);
		return j;
	}

	private void exchange(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

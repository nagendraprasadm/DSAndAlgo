package org.nm.dsalgo.problems.others;

public class CompareVersion {

	public static void main(String[] args) {
		CompareVersion _inst = new CompareVersion();
		System.out.println(_inst.compareVersion("0.1", "0.2"));
		System.out.println(_inst.compareVersion("0.2", "0.1"));
		System.out.println(_inst.compareVersion("12.1", "12"));
		System.out.println(_inst.compareVersion("12", "12.1"));

	}

	public int compareVersion(String version1, String version2) {
		String[] arr1 = version1.split("\\.");
		String[] arr2 = version2.split("\\.");
		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		int elem1 = 0;
		int elem2 = 0;
		for (int i = 0; i < length; i++) {
			elem1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
			elem2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
			if (elem1 > elem2) {
				return 1;
			} else if (elem1 < elem2) {
				return -1;
			}
		}
		return 0;
	}
}

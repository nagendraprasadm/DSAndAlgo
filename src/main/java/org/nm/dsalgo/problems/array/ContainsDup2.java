package org.nm.dsalgo.problems.array;

public class ContainsDup2 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums != null && nums.length > 0 && nums.length > k) {
			for (int i = 0; i < nums.length - k; i++) {
				System.out.println("\t " + i);
				for (int j = i + 1; j <= i + k; j++) {
					System.out.println("\t\t " + j);
					if (nums[i] == nums[j] || (i + k + 1 <= nums.length - 1 && nums[j] == nums[i + k + 1])) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		if (nums != null && nums.length > 0 && nums.length > k) {
			for (int i = 0; i < nums.length - k; i++){
				
			}
		}
		return false;
	}	

	public static void main(String[] args) {
		int nums[] = new int[] { -1, -1 };
		int k = 1;
		ContainsDup2 _inst = new ContainsDup2();
		System.out.println(_inst.containsNearbyDuplicate(nums, k));
		nums = new int[] { 1, 2, 3, 1, 5, 6, 7, 8 };
		k = 3;
		System.out.println(_inst.containsNearbyDuplicate(nums, k));
		nums = new int[] { 1, 2, 3, 1, 1, 6, 7, 8 };
		k = 2;
		System.out.println(_inst.containsNearbyDuplicate(nums, k));
		nums = null;
		k = 0;
		System.out.println(_inst.containsNearbyDuplicate(nums, k));

	}

}

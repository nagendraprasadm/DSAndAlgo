package org.nm.dsalgo.problems.array;

public class HouseRobber {

	public int rob(int[] nums) {
		if (nums != null && nums.length > 0) {
			int[] sums = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				int sums1 = i >= 1 ? sums[i - 1] : 0;
				int sums2 = i >= 2 ? sums[i - 2] : 0;
				sums[i] = nums[i] + sums2 > sums1 ? nums[i] + sums2
						: sums1;
			}
			return sums[nums.length - 1];
		}
		return 0;

	}

	public int robRev2(int[] nums) {
		if (nums != null && nums.length > 0) {
			int x = 0,y = 0,cur = 0;
			for (int i = 0; i < nums.length; i++) {
				cur = nums[i] + y;
				cur = cur > y ? cur : y;
				y = x;
				x = cur;
			}
			return cur;
		}
		return 0;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HouseRobber _isnt = new HouseRobber();
		System.out.println(_isnt.robRev2(new int[]{1,1,1,1}));

	}

}

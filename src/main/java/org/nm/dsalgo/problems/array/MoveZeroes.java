package org.nm.dsalgo.problems.array;

public class MoveZeroes {
	public void moveZeroes(int[] nums){
		if(nums != null && nums.length > 0){
			int pos = 0;
			for(int i = 0 ; i < nums.length ; i++){
				if(nums[i]!=0){
					nums[pos++] = nums[i];
				}
			}
			for(int i = pos; i < nums.length ; i ++){
				nums[i] = 0;
			}
		}
	}
	
	public void moveZeroes1(int[] nums) {
		if (nums != null && nums.length > 0) {
			int lastIndex = nums.length - 1;
			//int noOfZeroes = 0;
			int count = 0;
			int i = 0;
			int j = 0;
			while (j < nums.length ) {
				if (nums[i] == 0) {
					count++;
					//noOfZeroes++;
					i++;
				} else {
					if (count > 0) {
						shift(nums, i, lastIndex, count);
						lastIndex -= count;
					}
					i = i - count + 1;
					count = 0;
				}
				j++;
			}
			i = lastIndex + 1;
			while(i < nums.length){
				nums[i] = 0;
				i++;
			}
		}
	}

	private void shift(int[] nums, int i, int lastIndex, int count) {
		int j = i;
		while( j <= lastIndex){
			nums[j-count] = nums[j];
			j++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{0};
		MoveZeroes _instance = new MoveZeroes();
		_instance.moveZeroes(nums);
//		Util.printArr(nums);
		nums = new int[]{0,1};
		_instance.moveZeroes(nums);
//		Util.printArr(nums);
		nums = new int[]{0,1,0,3,12};
		_instance.moveZeroes(nums);
//		Util.printArr(nums);
		nums = new int[]{0,0,0,0};
		_instance.moveZeroes(nums);
//		Util.printArr(nums);
		nums = new int[]{0,0,1};
		_instance.moveZeroes(nums);
//		Util.printArr(nums);
		
	}

}

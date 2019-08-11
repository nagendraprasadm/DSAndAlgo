package org.nm.dsalgo.problems.array;

public class General {
	
	public int removeElement(int[] nums, int val){
	int pos = 0;
	if(nums != null && nums.length > 0){
			for(int i = 0; i < nums.length ; i++){
				if(nums[i] != val){
					nums[pos++] = nums[i];
				}
			}
		}
		return pos;
	}
	
	public int removeDuplicates(int[] nums){
		if(nums != null && nums.length > 0){
			int i = 1;
			int prev =nums[0];
			int count = 0;
			int totalDup = 0;
			int finalCnt = 1;
			while(finalCnt < nums.length){
				if(nums[i] == prev){
					count++;
					i++;
				}else{
					prev = nums[i];
					if(count > 0){
						move(nums, i, count);	
					}
					totalDup = count > 0 ? totalDup + count : totalDup;
					i = count > 0 ? i - count + 1: i + 1;
					count = 0;
				}
				finalCnt++;
			}
			return nums.length - (count > 0 ? totalDup + count : totalDup);
		}
		return 0;
	}
	
	private void move(int[] nums, int startPos, int count){
		for(int i = startPos; i < nums.length ; i++){
			nums[i-count] = nums[i];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		General _inst = new General();
		/*System.out.println(_inst.removeElement(new int[]{1,1,2,3,4,5,1,1}, 1));
		System.out.println(_inst.removeElement(new int[]{}, 1));
		System.out.println(_inst.removeElement(new int[]{1}, 1));*/
		System.out.println(_inst.removeDuplicates(new int[]{1,2,3,3,3,4,5,6}));
		System.out.println(_inst.removeDuplicates(new int[]{1,1}));
	  System.out.println(_inst.removeDuplicates(new int[]{1,2,2,2,2,2,2,3,3,3,3,3,3}));
	}

}

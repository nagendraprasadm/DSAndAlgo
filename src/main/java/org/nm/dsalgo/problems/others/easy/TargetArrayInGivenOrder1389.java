package org.nm.dsalgo.problems.others.easy;

/**
 * <pre>
 *     Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 *
 *     Initially target array is empty.
 *     From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 *     Repeat the previous step until there are no elements to read in nums and index.
 *
 * Return the target array.
 *
 * It is guaranteed that the insertion operations will be valid.
 * </pre>
 */
public class TargetArrayInGivenOrder1389
{
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0; i < index.length; i++){
            if( index[i] < i){
                int j = index.length - 1;
                while(j > index[i]){
                    target[j] = target[j-1];
                    j--;
                }
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}

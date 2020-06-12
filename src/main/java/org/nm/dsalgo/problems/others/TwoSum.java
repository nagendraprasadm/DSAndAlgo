package org.nm.dsalgo.problems.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *     1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * </pre>
 */
public class TwoSum
{
    public List<Integer> twoSum (int[] nums, int target)
    {
        if (nums != null && nums.length > 1) {
            Map<Integer, Integer> valToIdxMap = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = target - nums[i];
                if(!valToIdxMap.containsKey(temp)){
                    valToIdxMap.put(target - nums[i], i);
                }
            }

            for (int j = 1; j < nums.length; j++) {
                if (valToIdxMap.containsKey(nums[j]) && valToIdxMap.get(nums[j]) < j) {
                    List<Integer> result = new ArrayList<Integer>();
                    result.add(valToIdxMap.get(nums[j]));
                    result.add(j);
                    return result;
                }
            }
        }
        return new ArrayList<Integer>();
    }

    //Can be done in one loop.
    public int[] twoSumIter1(int[] nums, int target) {


        int[] result = new int[2];
        int count  = 0;
        if(nums != null && nums.length > 0){
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 0; i < nums.length ; i++){
                if(map.containsKey(nums[i])){
                    result[0] = map.get(nums[i]);
                    result[1] = i;
                    break;
                }else{
                    map.put(target - nums[i], i);
                }
            }
        }
        return result;


    }
}

package org.nm.dsalgo.problems.others.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 665. Non-decreasing Array
 *     Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
 * Example 1:
 * Input: nums = [4,2,3]
 * Output: true
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: nums = [4,2,1]
 * Output: false
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * Constraints:
 *     1 <= n <= 10 ^ 4
 *     - 10 ^ 5 <= nums[i] <= 10 ^ 5
 * </pre>
 */
public class NonDecreasinArray
{

    public boolean checkPossibility (int[] nums)
    {
        int cnt = 1;
        if (nums != null && nums.length > 1) {

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] < 0) {
                    cnt++;
                    if (cnt == 2) {
                        if (!(i == 1 || i == nums.length - 1) && (
                            nums[i + 1] - nums[i - 1] < 0))
                        {
                            if (!((i - 2) >= 0 && nums[i] >= nums[i - 2])) {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        return cnt <= 2;
    }

    public boolean checkPossibilityOne (int[] nums)
    {
        if (nums != null && nums.length > 1) {
            int cnt = 1;
            int[] starts = new int[2];
            starts[0] = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] < 0) {
                    cnt++;
                    if (cnt <= 2) {
                        starts[1] = i;
                    }
                    else {
                        return false;
                    }

                }
            }
            if (cnt == 2) {
                if (starts[1] == 1 || starts[1] == nums.length - 1) {
                    return true;
                }
                else {
                    if (nums[starts[1] + 1] - nums[starts[1] - 1] < 0) {
                        return (starts[1] - 2 >= 0 && nums[starts[1]] >= nums[starts[1]
                            - 2]);
                    }
                }
            }
        }
        return true;
    }
}

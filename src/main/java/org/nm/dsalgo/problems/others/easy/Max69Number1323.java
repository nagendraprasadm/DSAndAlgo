package org.nm.dsalgo.problems.others.easy;

import java.util.Stack;

/**
 * <pre>
 *
 *     Given a positive integer num consisting only of digits 6 and 9.
 *
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 *
 *
 *
 * Example 1:
 *
 * Input: num = 9669
 * Output: 9969
 * Explanation:
 * Changing the first digit results in 6669.
 * Changing the second digit results in 9969.
 * Changing the third digit results in 9699.
 * Changing the fourth digit results in 9666.
 * The maximum number is 9969.
 *
 * Example 2:
 *
 * Input: num = 9996
 * Output: 9999
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
 *
 * Example 3:
 *
 * Input: num = 9999
 * Output: 9999
 * Explanation: It is better not to apply any change.
 *
 *
 *
 * Constraints:
 *
 *     1 <= num <= 10^4
 *     num's digits are 6 or 9.
 * </pre>
 */
public class Max69Number1323
{
    public int maximum69Number (int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while(num > 0){
            int r = num%10;
            num = num/10;
            stack.push(r);
        }
        boolean marked = false;
        int result = 0;
        while(!stack.isEmpty()){
            int cur = stack.pop();
            if(!marked && cur == 6){
                cur = 9;
                marked = true;
            }
            result =  (result * 10) + cur;
        }

        return result;
    }

    /*
    Find the last place where 6 is and add (9-6) 3 * place

    If last 6 is in 100s place add 300, so 600 will become 900.
     */
    public int maximum69NumberFindPlace (int num) {
        int maxPlace = Integer.MIN_VALUE;
        int place = 1;
        int q = num;
        while(q > 0){
            int r = q%10;
            q = q/10;
            if(r == 6){
                maxPlace = place;
            }
            place *= 10;
        }
        return maxPlace == Integer.MIN_VALUE ? num : num + (maxPlace * 3);
    }
}

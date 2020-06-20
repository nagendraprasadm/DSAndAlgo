package org.nm.dsalgo.problems.others.easy;

/**
 * <pre>
 *     You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 *
 *     S and J will consist of letters and have length at most 50.
 *     The characters in J are distinct.
 * </pre>
 */
public class JewelsAndStones771
{
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if (J != null && J.length() > 0) {
            if (S != null && S.length() > 0) {
                char[] inputArr = S.toCharArray();
                for (int i = 0; i < inputArr.length; i++) {
                    if (J.indexOf(inputArr[i]) > -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

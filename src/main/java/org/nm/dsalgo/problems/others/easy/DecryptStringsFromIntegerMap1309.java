package org.nm.dsalgo.problems.others.easy;

/**
 * <pre>
 *     Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:
 *
 *     Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 *     Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 *
 * Return the string formed after mapping.
 *
 * It's guaranteed that a unique mapping will always exist.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "10#11#12"
 * Output: "jkab"
 * Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 *
 * Example 2:
 *
 * Input: s = "1326#"
 * Output: "acz"
 *
 * Example 3:
 *
 * Input: s = "25#"
 * Output: "y"
 *
 * Example 4:
 *
 * Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
 * Output: "abcdefghijklmnopqrstuvwxyz"
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 1000
 *     s[i] only contains digits letters ('0'-'9') and '#' letter.
 *     s will be valid string such that mapping is always possible.
 * </pre>
 */
public class DecryptStringsFromIntegerMap1309
{

    public String freqAlphabets (String s)
    {
        char[] alpha = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                                    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                    'w', 'x', 'y', 'z' };
        char[] inArr = s.toCharArray();
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < inArr.length) {
            if (i < inArr.length - 2 && inArr[i + 2] == '#') {
                int one = Character.getNumericValue(inArr[i]);
                int two = Character.getNumericValue(inArr[i + 1]);
                int curInt = (one * 10 + two) - 1;
                str.append((char)alpha[curInt]);
                i = i + 3;
            }
            else {
                int curInt = Character.getNumericValue(inArr[i]) - 1;
                str.append((char)alpha[curInt]);
                i++;
            }

        }
        return str.toString();
    }
}

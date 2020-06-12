package org.nm.dsalgo.problems.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *     438. Find All Anagrams in a String
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only
 * and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 * Example 1:
 * Input:
 * s: "cbaebabacd" p: "abc"
 * Output:
 * [0, 6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 * Input:
 * s: "abab" p: "ab"
 * Output:
 * [0, 1, 2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * </>
 */
public class AnagramsInString
{
    private static final Logger logger = LoggerFactory.getLogger(AnagramsInString.class);

    /**
     * -
     * Naive:
     * -----
     * Start with 0th index
     */
    public List<Integer> findAnagrams (String s, String p)
    {
        if (s != null && s.length() > 0 && p != null && p.length() > 0) {
            int sLength = s.length();
            int anagramLength = p.length();
            if (sLength < anagramLength) {
                return new ArrayList<Integer>();
            }
            else {
                List<Integer> result = new ArrayList<Integer>();
                char[] anagramChars = p.toCharArray();
                Arrays.sort(anagramChars);
                boolean wasAnagramEarlier = false;
                char lastAnagramInitialChar = '#';
                int i = 0;
                while (i < sLength) {
                    boolean isCurAnagram = false;
                    // Earlier was not an Anagram
                    // Cur is Anagram
                    // Move by length of Anagram
                    // Cur is not Anagram
                    // i++
                    if (!wasAnagramEarlier) {
                        if (isAnagram(anagramChars, s, i, i + anagramLength - 1)) {
                            lastAnagramInitialChar = s.charAt(i);
                            isCurAnagram = true;
                            result.add(i);
                            i += anagramLength;
                        }
                        else {
                            i++;
                        }
                    }
                    // Earlier was an Anagram
                    // Cur is Anagram
                    // i++
                    // Cur is not Anagram
                    // i++
                    else {
                        if (s.charAt(i) == lastAnagramInitialChar) {
                            isCurAnagram = true;
                            int prevStartIndex = i - anagramLength + 1;
                            lastAnagramInitialChar = s.charAt(prevStartIndex);
                            result.add(prevStartIndex);
                            i++;
                        }
                        else {
                            i = i - anagramLength + 2;
                        }
                    }
                    wasAnagramEarlier = isCurAnagram;
                }
                return result;
            }
        }
        return new ArrayList<Integer>();
    }

    private boolean isAnagram (char[] anagramChars,
                               String input,
                               int startIdx,
                               int endIndex)
    {
        if (startIdx < 0 || endIndex >= input.length()) {
            return false;
        }
        String interimStr = input.substring(startIdx, endIndex + 1);
        char[] interimCharArray = interimStr.toCharArray();
        Arrays.sort(interimCharArray);
        for (int i = 0; i < anagramChars.length; i++) {
            if (anagramChars[i] != interimCharArray[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * <pre>
     *     countMap is supposed to have expected Count Always.
     *     If a character is not part of anagram string then its mapCount goes to -ve.
     *     If a character repeats itself then it becomes negative.
     *     if a mapCount becomes -ve count will never increase.
     *      Which means if there is a repititon of Anagram characters, then until
     *      the count matches the number in the anagarm count will never increase.
     * </pre>
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> solution2 (String s, String p)
    {
        List<Integer> result = new ArrayList<Integer>();

        int[] map = new int[256];
        for (int i = 0; i < p.length(); i++) {
            map[p.charAt(i)]++;
        }
        int[] curMap = map;
        int begin = 0, end = 0, count = p.length();
        logger.debug("String - {}, Anagarm - {}", s,p);
        while (end < s.length()) {
            //Only when count >= 1 decrement the count? Why
            //If the expected Count is >= 1 only can the count be decremented.
            if (curMap[s.charAt(end)] >= 1) {
                count--;
            }
            logger.debug(
                "Iteration - {}, character - {}, curMap[s.CharAt[end]] - {}, count - {}",
                end,
                s.charAt(end),
                curMap[s.charAt(end)],
                count);
            //Decrease the count always
            curMap[s.charAt(end)]--;
            //Increment the index always
            end++;

            if (count == 0)
                result.add(begin);
            logger.debug("Iteration - {} , Result - {}", end - 1, result.toArray());
            if (end - begin == p.length()) {
                //Increase the count only when curMap contains values >=0 ? Why
                // This is to avoid cases when there are duplicates which are to be ignored
                // while moving forward and Non Anagram Characters.
                if (curMap[s.charAt(begin)] >= 0) {
                    count++;
                }
                logger.debug(
                    "Iteration - {}, When Length Matched, Begin - {}, character - {}, curMap[s.CharAt[begin]] - {}, count - {}",
                    end,
                    begin,
                    s.charAt(begin),
                    curMap[s.charAt(begin)],
                    count);
                curMap[s.charAt(begin)]++;
                begin++;
            }
            logger.debug("");
            logger.debug("-------------------");
            logger.debug("");
        }

        return result;
    }
}

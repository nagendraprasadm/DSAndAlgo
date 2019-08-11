package org.nm.dsalgo.problems.others.easy;

public class JewelsAndStones {
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

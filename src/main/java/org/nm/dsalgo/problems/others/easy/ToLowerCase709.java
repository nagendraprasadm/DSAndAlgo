package org.nm.dsalgo.problems.others.easy;

/**
 * Conert a given a string to lower case
 */
public class ToLowerCase709
{
    public String toLowerCase(String str) {
        if(str != null && !str.isEmpty()){
            char[] inputArr = str.toCharArray();
            for(int i =0; i < inputArr.length; i++){
                int curInt = inputArr[i];
                if(curInt < 91 && curInt > 64){
                    inputArr[i] = (char)(curInt + 32);
                }
            }
            return new String(inputArr);
        }
        return str;
    }
}

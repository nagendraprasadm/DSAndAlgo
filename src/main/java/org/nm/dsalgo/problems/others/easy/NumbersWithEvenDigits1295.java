package org.nm.dsalgo.problems.others.easy;

public class NumbersWithEvenDigits1295
{
    public int findNumbers(int[] nums) {
        int evenNoOfDigitsCnt = 0;
        for(int i =0 ; i < nums.length; i++){
            if(noOfDigits(nums[i])%2 == 0){
                evenNoOfDigitsCnt++;
            }
        }
        return evenNoOfDigitsCnt;
    }

    private int noOfDigits(int n){
        int noOfDigits = 0;
        while(n > 0){
            n = n/10;
            noOfDigits++;
        }
        return noOfDigits;
    }
}

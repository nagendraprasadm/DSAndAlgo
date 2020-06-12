package org.nm.dsalgo.problems.greedy;

import java.util.Arrays;

public class MaxSumAfterKNegations
{
    public int largestSumAfterKNegations (int[] A, int K)
    {
        Arrays.sort(A);
        //Negative
        int j = 0;
        for (int i = 0; i < K && j < A.length; i++) {
            if (A[j] < 0) {
                A[j] = -A[j];
                j++;
            }
            else {
                break;
            }
        }
        if (j >= K || (j < A.length && A[j] == 0)) {
            return sum(A);
        }
        else {
            Arrays.sort(A);
            K = K - j;
            if (K % 2 != 0) {
                A[0] = -A[0];
            }
            return sum(A);
        }
    }

    private int sum (int[] A)
    {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

}

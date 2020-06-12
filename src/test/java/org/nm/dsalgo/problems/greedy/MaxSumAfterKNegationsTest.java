package org.nm.dsalgo.problems.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumAfterKNegationsTest
{

    private static MaxSumAfterKNegations inst = new MaxSumAfterKNegations();

    @Test
    public void testOneArrayWithOneK(){
        int[] A = new int[]{1};
        int sum = inst.largestSumAfterKNegations(A, 1);
        assertEquals(-1, sum);
    }


    @Test
    public void testOneArrayWithMoreK(){
        int[] A = new int[]{1};
        int sum = inst.largestSumAfterKNegations(A, 2);
        assertEquals(1, sum);
    }

    @Test
    public void testOneArrayNegativeValueWithOneK(){
        int[] A = new int[]{-1};
        int sum = inst.largestSumAfterKNegations(A, 1);
        assertEquals(1, sum);
    }

    @Test
    public void testOneArrayNegativeValueWithTwoK(){
        int[] A = new int[]{-1};
        int sum = inst.largestSumAfterKNegations(A, 2);
        assertEquals(-1, sum);
    }

}
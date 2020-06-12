package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonDecreasinArrayTest
{

    private NonDecreasinArray inst = new NonDecreasinArray();

    @Test
    public void testOne(){
        int[] nums = new int[]{};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testTwo(){
        int[] nums = new int[]{1};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testThree(){
        int[] nums = new int[]{1,2};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testFour(){
        int[] nums = new int[]{2,1};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testFive(){
        int[] nums = new int[]{4,2,3};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testSix(){
        int[] nums = new int[]{4,2,1};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(!isNonDecreasing);
    }

    @Test
    public void testDuplicateOne(){
        int[] nums = new int[]{3,4,2,3};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(!isNonDecreasing);
    }

    @Test
    public void testEight(){
        int[] nums = new int[]{3,4,5,3};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testNine(){
        int[] nums = new int[]{3,4,5,1};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testTen(){
        int[] nums = new int[]{3,4,3,5,1};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(!isNonDecreasing);
    }

    @Test
    public void testEleven(){
        int[] nums = new int[]{3,4,3,5};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testTwelve(){
        int[] nums = new int[]{3,4,2,3};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(!isNonDecreasing);
        nums = new int[]{3,4,2,5};
        isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
        nums = new int[]{2,4,2,5};
        isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
        nums = new int[]{2,4,2,3};
        isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testThirteen(){
        int[] nums = new int[]{1,1,1};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(isNonDecreasing);
    }

    @Test
    public void testFourteen(){
        int[] nums = new int[]{1,2,5,4,3};
        boolean isNonDecreasing = inst.checkPossibility(nums);
        assertTrue(!isNonDecreasing);
    }
}
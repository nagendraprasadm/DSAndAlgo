package org.nm.dsalgo.problems.others;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TwoSumTest
{

    private TwoSum inst = new TwoSum();

    @Test
    public void testOne ()
    {
        int[] nums = null;
        int target = -1;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTwo ()
    {
        int[] nums = { 1 };
        int target = -1;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testThree ()
    {
        int[] nums = { 1, 2 };
        int target = -1;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFour ()
    {
        int[] nums = { 1, 2 };
        int target = 3;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.size() == 2);
        assertTrue(result.get(0) == 0);
        assertTrue(result.get(1) == 1);
    }

    @Test
    public void testFive ()
    {
        int[] nums = { -2, 1 };
        int target = -1;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.size() == 2);
        assertTrue(result.get(0) == 0);
        assertTrue(result.get(1) == 1);
    }

    @Test
    public void testSix ()
    {
        int[] nums = { 3, -2, 6, 7, 1, 9 };
        int target = -1;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.size() == 2);
        assertTrue(result.get(0) == 1);
        assertTrue(result.get(1) == 4);
    }

    @Test
    public void testSeven ()
    {
        int[] nums = { 3, 2, 2, 6, 7, 1, 9 };
        int target = 3;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.size() == 2);
        assertTrue(result.get(0) == 1);
        assertTrue(result.get(1) == 5);
    }

    @Test
    public void testEight ()
    {
        int[] nums = { -1, -2, -3, -4, -5 };
        int target = -8;
        List<Integer> result = getTwoSum(nums, target);
        assertTrue(result.size() == 2);
        assertTrue(result.get(0) == 2);
        assertTrue(result.get(1) == 4);
    }

    private List<Integer> getTwoSum (int[] nums, int target)
    {
        return inst.twoSum(nums, target);
    }
}
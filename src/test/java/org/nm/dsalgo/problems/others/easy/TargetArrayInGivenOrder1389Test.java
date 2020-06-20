package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TargetArrayInGivenOrder1389Test
{
    private TargetArrayInGivenOrder1389 inst = new TargetArrayInGivenOrder1389();

    @Test
    public void testOne(){
        int[] target = targetArray(new int[]{0,1,2,3,4},
new int[] {0,1,2,2,1 });
        assertArrayEquals(new int[] {0,4,1,3,2}, target);
    }

    private int[] targetArray(int[] nums, int[] index){
        return inst.createTargetArray(nums, index);
    }

}
package org.nm.dsalgo.problems.others.easy;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleTheArray1470Test
{

    private ShuffleTheArray1470 inst = new ShuffleTheArray1470();

    @Test
    public void testSix(){
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        nums = shuffle(nums, n);
        Assert.assertArrayEquals(new int[]{2,3,5,4,1,7}, nums);
    }

    private int[] shuffle(int[] nums, int n){
        return inst.shuffle(nums, n);
    }

}
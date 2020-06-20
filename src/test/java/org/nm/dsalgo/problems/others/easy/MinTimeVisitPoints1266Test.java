package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinTimeVisitPoints1266Test
{

    private MinTimeVisitPoints1266 inst = new MinTimeVisitPoints1266();

    @Test
    public void testOne(){
        int[][] points = new int[][]{{3,2},{-2,2}};
        int result = jumpsRequired(points);
        assertTrue(5 == result);
    }

    @Test
    public void testTwo(){
        int[][] points = new int[][]{{1,1},{3,4}, {-1,0}};
        int result = jumpsRequired(points);
        assertTrue(7 == result);
    }

    private int jumpsRequired(int[][] nums){
        return inst.minTimeToVisitAllPointsEff(nums);
    }
}
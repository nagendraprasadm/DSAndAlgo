package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNegativeNumbersSortedMatrix1351Test
{
    private CountNegativeNumbersSortedMatrix1351 inst = new CountNegativeNumbersSortedMatrix1351();

    @Test
    public void testOne(){
        int[][] grid = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int cnt = getNegativeNumbers(grid);
        assertTrue(8 == cnt);
    }

    private int getNegativeNumbers(int[][] grid){
        return inst.countNegatives(grid);
    }

}
package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellsWithOddValues1252Test
{

    private CellsWithOddValues1252 inst = new CellsWithOddValues1252();

    @Test
    public void testOne(){
        int[][] indices = new int[][]{{0,1},{1,1}};
        int oddCnt = getOddValues(2,3,indices);
        assertTrue(6 == oddCnt);
    }

    @Test
    public void testTwo(){
        int[][] indices = new int[][]{{1,1},{0,0}};
        int oddCnt = getOddValues(2,2,indices);
        assertTrue(6 == oddCnt);
    }

    private int getOddValues(int n, int m, int[][] indices){
        return inst.oddCells(n,m,indices);
    }
}
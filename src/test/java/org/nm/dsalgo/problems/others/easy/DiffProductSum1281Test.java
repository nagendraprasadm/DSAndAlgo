package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiffProductSum1281Test
{

    private DiffProductSum1281 inst = new DiffProductSum1281();

    @Test
    public void testOne(){
        int n = findDiff(234);
        assertTrue(15 == n);
    }

    private int findDiff(int n){
        return inst.subtractProductAndSum(n);
    }

}
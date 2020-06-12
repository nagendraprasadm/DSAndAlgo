package org.nm.dsalgo.problems.DivideAndConquer;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest
{

    private MajorityElement _inst = new MajorityElement();

    @Test
    public void testOne ()
    {
        int[] input = new int[] { 1 };
        int majorityElemnt = _inst.majorityElement(input);
        assertEquals(1, majorityElemnt);
    }

    @Test
    public void testTwo ()
    {
        int[] input = new int[] { 1, 2 };
        int majorityElemnt = _inst.majorityElement(input);
        assertEquals(2, majorityElemnt);
    }

    @Test
    public void testThree ()
    {
        int[] input = new int[] { 1, 2, 2 };
        int majorityElemnt = _inst.majorityElement(input);
        assertEquals(2, majorityElemnt);
    }

    @Test
    public void testThreeOtherWay ()
    {
        int[] input = new int[] { 1, 1, 2 };
        int majorityElemnt = _inst.majorityElement(input);
        assertEquals(1, majorityElemnt);
    }

    @Test
    public void testFour ()
    {
        int[] input = new int[] { 1, 2, 2, 2 };
        int majorityElemnt = _inst.majorityElement(input);
        assertEquals(2, majorityElemnt);
    }

    @Test
    public void testFourOtherWay ()
    {
        int[] input = new int[] { 1, 1, 1, 2 };
        int majorityElemnt = _inst.majorityElement(input);
        assertEquals(1, majorityElemnt);
    }
}
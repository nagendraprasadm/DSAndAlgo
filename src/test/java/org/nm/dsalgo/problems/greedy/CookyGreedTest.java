package org.nm.dsalgo.problems.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CookyGreedTest
{

    private static CookyGreed inst = new CookyGreed();

    @Test
    public void testNullGreedy ()
    {
        int contentChildren = inst.contentChildren(null, null);
        assertEquals(0, contentChildren);
    }

    @Test
    public void testSimple ()
    {
        int contentChildren = inst.contentChildren(new int[] { 1 }, new int[] { 1 });
        assertEquals(1, contentChildren);
    }

    @Test
    public void testSimpleWithLessSize ()
    {
        int contentChildren = inst.contentChildren(new int[] { 1 }, new int[] { 0 });
        assertEquals(0, contentChildren);
    }

    @Test
    public void testSimpleWithMoreSize ()
    {
        int contentChildren = inst.contentChildren(new int[] { 1 }, new int[] { 2 });
        assertEquals(1, contentChildren);
    }

    @Test
    public void testSimpleWithMoreChildren ()
    {
        int contentChildren = inst.contentChildren(new int[] { 1, 2 }, new int[] { 2 });
        assertEquals(1, contentChildren);
    }

    @Test
    public void testSimpleWithMoreCookies ()
    {
        int contentChildren = inst.contentChildren(new int[] { 1, 2 },
            new int[] { 1, 2, 3 });
        assertEquals(2, contentChildren);
    }

    @Test
    public void testSimpleunordered ()
    {
        int contentChildren = inst.contentChildren(new int[] { 10, 9, 8, 7 },
            new int[] { 5, 6, 7, 8 });
        assertEquals(2, contentChildren);
    }
}
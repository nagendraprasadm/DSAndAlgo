package org.nm.dsalgo.sort;

import org.junit.Test;
import org.junit.internal.runners.TestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class HeapSortTest
{
    private static Logger logger = LoggerFactory.getLogger(HeapSortTest.class);

    private Sort sorter = new HeapSort();

    @Test
    public void nullSort ()
    {
        int[] arr = sorter.sort(null);
        assertTrue(arr == null);
    }

    @Test
    public void blank ()
    {
        int[] arr = sorter.sort(new int[] {});
        assertTrue(arr != null && (arr.length == 0));
    }

    @Test
    public void single ()
    {
        int[] arr = sorter.sort(new int[] { 1 });
        assertArrayEquals(new int[] { 1 }, arr);
    }

    @Test
    public void doubleNoHeap ()
    {
        int[] arr = sorter.sort(new int[] { 1, 2 });
        assertArrayEquals(new int[] { 1,2 }, arr);
    }

    @Test
    public void doubleAlreadyHeap ()
    {
        int[] arr = sorter.sort(new int[] { 2, 1 });
        assertArrayEquals(new int[] { 1, 2 }, arr);
    }

    @Test
    public void threeNoHeap ()
    {
        int[] arr = sorter.sort(new int[] { 1, 2, 3 });
        assertArrayEquals(new int[] { 1,2,3 }, arr);
    }

    @Test
    public void threeAlreadyHeap ()
    {
        int[] arr = sorter.sort(new int[] { 3, 2, 1 });
        assertArrayEquals(new int[] { 1,2,3}, arr);
    }

    @Test
    public void threeOption2 ()
    {
        int[] arr = sorter.sort(new int[] { 2, 1, 3 });
        assertArrayEquals(new int[] { 1,2,3 }, arr);
    }

    @Test
    public void fourOne ()
    {
        int[] arr = sorter.sort(new int[] { 1, 2, 3, 4, 5 });
        logger.info("Array after heapify - {}", arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void fourTwo ()
    {
        int[] arr = sorter.sort(new int[] { 1, 2, 5, 4, 3 });
        logger.info("Array after heapify - {}", arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void TenOne ()
    {
        int[] arr = sorter.sort(new int[] { 11, 89 , 4, 128, 44 , 1008, 564, -20, 100123, 1 });
        logger.info("Array after heapify - {}", arr);
        assertArrayEquals(new int[] { -20, 1, 4, 11, 44, 89, 128, 564, 1008, 100123}, arr);
    }
}
package org.nm.dsalgo.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortIntTest {

    private Sort sorter = new QuickSortInt();

    @Test
    public void testNULL() {
        int[] arr = sorter.sort(null);
        assertNull(arr);
    }

    @Test
    public void testBlank() {
        int[] arr = sorter.sort(new int[]{});
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testOne() {
        int[] arr = sorter.sort(new int[]{1});
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    public void testTwo() {
        int[] arr = sorter.sort(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    @Test
    public void testTwoReverse() {
        int[] arr = sorter.sort(new int[]{2, 1});
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    @Test
    public void testThree() {
        int[] arr = sorter.sort(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testThreerev() {
        int[] arr = sorter.sort(new int[]{3, 2, 1});
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testTen() {
        int[] arr = sorter.sort(new int[]{40, 21, 112, 90, 12, 56, 3, 4});
        assertArrayEquals(new int[]{3, 4, 12, 21, 40, 56, 90, 112}, arr);
    }
}
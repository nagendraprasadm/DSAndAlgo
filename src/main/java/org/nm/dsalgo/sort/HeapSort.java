package org.nm.dsalgo.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeapSort implements Sort
{
    private static final Logger logger = LoggerFactory.getLogger(HeapSort.class);

    @Override
    public int[] sort (int[] arr)
    {
        if (arr != null && arr.length > 1) {
            arr = converToMaxHeap(arr);
            logger.info("Array converted to heap - {}", arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                swap(arr, 0, i);
                heapify(arr, 0, i);
            }
            logger.info("Heap sorted - {}", arr);
        }
        return arr;
    }

    private int[] converToMaxHeap (int[] arr)
    {
        if (arr != null && arr.length > 1) {
            for (int i = arr.length / 2; i >= 0; i--) {
                heapify(arr, i, arr.length);
            }
        }
        return arr;
    }

    private void heapify (int[] arr, int pos, int len)
    {
        logger.info("Array - {}, position - {}", arr, pos);
        if (pos >= len) {
            return;
        }
        int element = arr[pos];
        int lIdx = getLeftChildIndex(pos);
        int rIdx = getRightChildIndex(pos);
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        if (lIdx < len) {
            left = arr[lIdx];
        }
        if (rIdx < len) {
            right = arr[rIdx];
        }

        if (left > element || right > element) {
            if (left > right) {
                swap(arr, pos, lIdx);
                heapify(arr, lIdx, len);
            }
            else {
                swap(arr, pos, rIdx);
                heapify(arr, rIdx, len);
            }
        }
    }

    private int getLeftChildIndex (int pos)
    {
        return pos == 0 ? 1 : pos * 2 + 1;
    }

    private int getRightChildIndex (int pos)
    {
        return pos == 0 ? 2 : pos * 2 + 2;
    }

    private void swap (int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}

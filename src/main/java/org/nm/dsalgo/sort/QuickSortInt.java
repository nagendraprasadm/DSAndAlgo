package org.nm.dsalgo.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickSortInt implements Sort {

    private static final Logger logger = LoggerFactory.getLogger(QuickSortInt.class);

    @Override
    public int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int lo, int high) {
        if (lo < high) {
            logger.info("Quick Sort on arr - {}, lo - {} and high - {}", arr, lo, high);
            int p = partition(arr, lo, high);
            logger.info("After Partitioning - {}, partition - {}", arr, p);
            quickSort(arr, lo, p - 1);
            quickSort(arr, p + 1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int lo, int hi) {
        int p = hi;
        int i = lo;
        int pivot = arr[p];
        logger.debug("Partition Call : low - {}, hi - {}, pivot - {}, input - {}", lo, hi, pivot, arr);
        for (int j = lo; j < hi; j++) {
            if (arr[j] < pivot) {
                swapElemts(arr, j, i);
                i++;
            }
        }
        swapElemts(arr, i, hi);
        logger.debug("Partition chosen - {}, post partition - {}", i, arr);
        return i;
    }

    private void swapElemts(int[] arr, int posOne, int posTwo) {
        logger.debug("Swapping elemnts of indices {} and {}", posOne, posTwo);
        int tmp = arr[posOne];
        arr[posOne] = arr[posTwo];
        arr[posTwo] = tmp;
    }

}

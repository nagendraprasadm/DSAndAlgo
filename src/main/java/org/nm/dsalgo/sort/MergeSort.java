package org.nm.dsalgo.sort;

import java.util.Arrays;

public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        if (arr != null) {
            if (arr.length <= 1) return arr;

            int len = arr.length;
            int mid = len / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, len);
            left = sort(left);
            right = sort(right);
            return merge(left, right, arr);
        }
        return arr;
    }

    private int[] merge(int[] left, int[] right, int[] arr) {
        int len = arr.length;
        int leftIdx = 0;
        int rightIdx = 0;
        for (int i = 0; i < len; i++) {
            if (leftIdx < left.length && rightIdx < right.length) {
                if (left[leftIdx] < right[rightIdx]) {
                    arr[i] = left[leftIdx++];
                } else {
                    arr[i] = right[rightIdx++];
                }
            } else {
                if (leftIdx < left.length) {
                    arr[i] = left[leftIdx++];
                } else {
                    arr[i] = right[rightIdx++];
                }
            }
        }
        return arr;

    }
}

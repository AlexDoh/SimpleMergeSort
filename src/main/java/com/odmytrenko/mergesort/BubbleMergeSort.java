package com.odmytrenko.mergesort;

public class BubbleMergeSort {

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    protected static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    protected static void merge(int[] array, int low, int middle, int high) {
        int i = low;
        int j = middle + 1;
        while (j <= high) {
            while (i <= high) {
                if (array[i] > array[j]) {
                    int tempI = array[i];
                    array[i] = array[j];
                    array[j] = tempI;
                }
                i++;
            }
            i = low;
            j++;
        }
    }
}


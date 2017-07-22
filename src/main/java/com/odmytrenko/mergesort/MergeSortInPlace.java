package com.odmytrenko.mergesort;

public class MergeSortInPlace {

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private static void merge(int[] array, int low, int middle, int high) {
        middle++;
        while (low <= middle && middle <= high) {
            if (array[middle] < array[low]) {
                putElementToArray(array, low, middle);
                middle++;
            }
            low++;
        }
    }

    private static void putElementToArray(int[] array, int indexForStartPlacing, int indexForFinishPlacing) {
        int tempValue = array[indexForFinishPlacing];
        System.arraycopy(array, indexForStartPlacing, array, indexForStartPlacing + 1,
                indexForFinishPlacing - indexForStartPlacing);
        array[indexForStartPlacing] = tempValue;
    }
}

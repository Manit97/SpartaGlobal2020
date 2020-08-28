package org.sorters;

public class MergeSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int[] sortedArray = sorter(arrayToSort, arrayToSort.length);
        return sortedArray;
    }
    public static int[] sorter(int[] array, int lengthOfArray){
        if (lengthOfArray < 2) {
            return array;
        }
        int midpoint = lengthOfArray / 2;
        int[] leftside = new int[midpoint];
        int[] rightside = new int[lengthOfArray - midpoint];

        for (int i = 0; i < midpoint; i++) {
            leftside[i] = array[i];
        }
        for (int i = midpoint; i < lengthOfArray; i++) {
            rightside[i - midpoint] = array[i];
        }
        sorter(leftside, midpoint);
        sorter(rightside, lengthOfArray - midpoint);

        merger(array, leftside, rightside, midpoint, lengthOfArray - midpoint);
        return array;
    }

    private static void merger(int[] array, int[] leftside, int[] rightside, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftside[i] <= rightside[j]) {
                array[k++] = leftside[i++];
            }
            else {
                array[k++] = rightside[j++];
            }
        }
        while (i < left) {
            array[k++] = leftside[i++];
        }
        while (j < right) {
            array[k++] = rightside[j++];
        }
    }

}
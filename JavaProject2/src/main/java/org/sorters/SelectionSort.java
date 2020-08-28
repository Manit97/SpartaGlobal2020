package org.sorters;


public class SelectionSort implements Sorter{

    @Override
    public int[] sortArray(int arrayToSort[])
    {
        int length = arrayToSort.length;

        for (int i = 0; i < length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++)
                if (arrayToSort[j] < arrayToSort[minIndex])
                    minIndex = j;

            int temp = arrayToSort[minIndex];
            arrayToSort[minIndex] = arrayToSort[i];
            arrayToSort[i] = temp;
        }
        return arrayToSort;
    }

}
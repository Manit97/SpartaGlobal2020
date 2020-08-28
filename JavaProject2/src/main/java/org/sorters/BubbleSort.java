package org.sorters;

public class BubbleSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int n = arrayToSort.length;
        //iterate over the array comparing adjacent elements
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                //if elements not in order, swap them
                if (arrayToSort[j] > arrayToSort[j+1])  {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
        return arrayToSort;
    }
}
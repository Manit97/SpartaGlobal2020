package org.sorters;

public class QuickSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int[] sortedArray = sorter(arrayToSort, 0, arrayToSort.length - 1);
        return sortedArray;
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int indexOfSmallElement = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] < pivot)
            {
                indexOfSmallElement++;

                int temp = arr[indexOfSmallElement]; //swapping
                arr[indexOfSmallElement] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[indexOfSmallElement+1];
        arr[indexOfSmallElement+1] = arr[high];
        arr[high] = temp;

        return indexOfSmallElement+1;
    }


    public static int[] sorter(int[] arr, int startingIndex, int endingIndex)
    {
        if (startingIndex < endingIndex)
        {
            int partingIndex = partition(arr, startingIndex, endingIndex);

            sorter(arr, startingIndex, partingIndex-1);
            sorter(arr, partingIndex+1, endingIndex);
        }
        return arr;
    }

}
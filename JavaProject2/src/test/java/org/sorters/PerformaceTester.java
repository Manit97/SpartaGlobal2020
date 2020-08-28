package org.sorters;
import BinaryTree.BinaryTreeIMPL;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PerformaceTester {
    private int[] unsortedArray;
    private static int[] arrayToSort;
    
    @BeforeClass
    public static void allSetUp(){
        Random random = new Random();
        arrayToSort = new int[100];
        for (int i = 0; i < 100; i++){
            arrayToSort[i] = random.nextInt(1000)+1;
        }
    }
    
    @Before
    public void setUP(){
        unsortedArray = arrayToSort.clone();
    }
    
    @Test
    public void testBubbleSort(){
        System.out.println(Arrays.toString(unsortedArray));
        Sorter sorter = new BubbleSort();
        double start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        double end = System.nanoTime();
        double totalTime = (end - start);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(totalTime / 1000000);

        //prntResults(sorter.toString(),end - start, sortedArray);
    }
//    private void prntResults(String toString, long l, int[] sortedArray) {
//    }
    @Test
    public void testInsertionSort(){
        System.out.println("-------"+ Arrays.toString(unsortedArray));
        Sorter sorter = new InsertionSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        System.out.println("----"+ Arrays.toString(sortedArray));
        System.out.println(totalTime / 1000000);
    }

    @Test
    public void testQuickSort(){
        System.out.println("-------"+ Arrays.toString(unsortedArray));
        Sorter sorter = new QuickSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        System.out.println("----"+ Arrays.toString(sortedArray));
        System.out.println(totalTime / 1000000);
    }
    @Test
    public void testMergeSort(){
        System.out.println("-------"+ Arrays.toString(unsortedArray));
        Sorter sorter = new MergeSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        System.out.println("----"+ Arrays.toString(sortedArray));
        System.out.println(totalTime / 1000000);
    }
    @Test
    public void testSelectionSort(){
        System.out.println("-------"+ Arrays.toString(unsortedArray));
        Sorter sorter = new SelectionSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        System.out.println("----"+ Arrays.toString(sortedArray));
        System.out.println(totalTime / 1000000);
    }
    @Test
    public void testBST(){
        System.out.println("-------"+ Arrays.toString(unsortedArray));
        Sorter sorter = new BinaryTreeIMPL(unsortedArray[0]);
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        double totalTime = (end - start);
        System.out.println("----"+ Arrays.toString(sortedArray));
        System.out.println(totalTime / 1000000);
    }

}

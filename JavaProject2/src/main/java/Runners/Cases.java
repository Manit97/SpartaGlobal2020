//package Runners;
//
//import BinaryTree.BinaryTreeIMPL;
//import Exceptions.NoNegativesException;
//import org.sorters.*;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
//
//public class Cases {
//
//    public static void PrintArr(int[] arr)//print array
//    {
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//
//    }
//
//    public static void factoryCases() throws NoNegativesException {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter you choice: ");
//        int method = scan.nextInt();
//
//
//        System.out.print("Please enter the size of array you wish to generate: ");
//        int size = scan.nextInt();
//
//        if (size < 1) {
//            throw new NoNegativesException();
//        }
//
//        Random randomNumberGenerator = new Random();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Math.abs(randomNumberGenerator.nextInt() % 100); // storing randomNumberGenerator integers in an array
//        }
//
//        double totalTime = 0;
//        long startTime = 0;
//        long endTime = 0;
//        switch (method) {
//            case 1:
//                System.out.println("Sorting using the BubbleSorter");
//                System.out.println("Before Sorting:");
//                PrintArr(arr);
//                startTime = System.nanoTime();
//                BubbleSort bubbleSort = new BubbleSort();
//                BubbleSort.sort(arr);
//                endTime = System.nanoTime();
//                totalTime = (((double) endTime - (double) startTime))/1000000;
//                TimeUnit.NANOSECONDS.toSeconds((long) totalTime);
//                break;
//            case 2:
//                System.out.println("Sorting using the MergeSorter");
//                System.out.println("Before Sorting:");
//                PrintArr(arr);
//                startTime = System.currentTimeMillis();
//                MergeSort mergeSort = new MergeSort();
//                MergeSort.sorter(arr, arr.length);
//                endTime = System.currentTimeMillis();
//                totalTime = ((double) endTime - (double) startTime);
//                break;
//            case 3:
//                System.out.println("Sorting using the BinarySorter");
//                System.out.println("Before Sorting:");
//                PrintArr(arr);
//                startTime = System.currentTimeMillis();
//                BinaryTreeIMPL tree = new BinaryTreeIMPL(arr[0]);
//                for (int i = 1;i < arr.length; i++) {
//                    tree.addElement(arr[i]);
//                }
//                arr = tree.getSortedTreeDesc();
//                arr = tree.getSortedTreeAsc();
//                endTime = System.currentTimeMillis();
//                totalTime = ((double) endTime - (double) startTime);
//                break;
//            case 4:
//                System.out.println("Sorting using the Insertion Sorter");
//                System.out.println("Before Sorting:");
//                PrintArr(arr);
//                startTime = System.currentTimeMillis();
//                InsertionSort insertionSorter = new InsertionSort();
//                InsertionSort.sorter(arr);
//                endTime = System.currentTimeMillis();
//                totalTime = ((double) endTime - (double) startTime);
//                break;
//            case 5:
//                System.out.println("Sorting using the Selection Sorter");
//                System.out.println("Before Sorting:");
//                PrintArr(arr);
//                startTime = System.currentTimeMillis();
//                SelectionSort selectionSort = new SelectionSort();
//                SelectionSort.sorter(arr);
//                endTime = System.currentTimeMillis();
//                totalTime = ((double) endTime - (double) startTime);
//                break;
//            case 6:
//                System.out.println("Sorting using the Quick Sorter");
//                System.out.println("Before Sorting:");
//                PrintArr(arr);
//                startTime = System.currentTimeMillis();
//                QuickSort quickSort = new QuickSort();
//                int n = arr.length;
//                quickSort.sorter(arr, 0, n - 1);
//                endTime = System.currentTimeMillis();
//                totalTime = ((double) endTime - (double) startTime);
//                break;
//            default:
//                System.out.println("Wrong Sorting Method input");
//                return;
//        }
//
//        System.out.println("\nAfter Sorting:");
//        PrintArr(arr);
//        System.out.println("\nTime Taken: " + totalTime + " milliseconds");
//
//        scan.close();
//    }
//}
//

package Runners;

import Exceptions.NoNegativesException;
import org.sorters.Sorter;

import java.util.Random;
import java.util.Scanner;

public class Starter {
    public static int[] arrayToSort;
    public static void main(String[] args) throws NoNegativesException {
        Printer.printOptions();
        System.out.print("Enter you choice: ");
        Scanner scan = new Scanner(System.in);
        int sortChoice = scan.nextInt();
        if (sortChoice < 1) {
            throw new NoNegativesException();
        }

        System.out.println("Please enter the size of the array you wish to generate: ");
        int arraySize = scan.nextInt();

        Random random = new Random();
        arrayToSort = new int[arraySize];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = Math.abs(random.nextInt() % 100);
        }

        System.out.println("Before Sorting: ");
        for (int i = 0; i< Starter.arrayToSort.length ; i++) {
            System.out.print(Starter.arrayToSort[i]+", ");
        }
        Sorter sort = Factory.createSorter(sortChoice);

        System.out.println("\nAfter Sorting:");
        int[] sortedArray = sort.sortArray(Starter.arrayToSort);
        for (int i=0; i<sortedArray.length; i++) {
            System.out.print(sortedArray[i]+", ");
        }
        TimeCatcher timeCatcher = new TimeCatcher();
        System.out.println("\n");
        timeCatcher.timer(sort, arrayToSort);

    }
}

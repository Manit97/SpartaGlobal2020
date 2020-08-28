package Runners;

import BinaryTree.BinaryTreeIMPL;
import org.sorters.*;

public class Factory {
    public static Sorter createSorter(int sortChoice){
        switch (sortChoice){
            case 1:
                System.out.println("\nBinary Sort: ");
                return new BinaryTreeIMPL(Starter.arrayToSort[0]);
            case 2:
                System.out.println("\nMerge Sort: ");
                return new MergeSort();
            case 3:
                System.out.println("\nSelection Sort: ");
                return new SelectionSort();
            case 4:
                System.out.println("\nBubble Sort: ");
                return new BubbleSort();
            case 5:
                System.out.println("\nQuick Sort: ");
                return new QuickSort();
            case 6:
                System.out.println("\nInsertion Sort: ");
                return new InsertionSort();
        }
        return null;
    }
}

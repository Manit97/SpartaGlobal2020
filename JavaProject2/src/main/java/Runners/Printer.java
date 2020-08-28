package Runners;

public class Printer {
    public static void printOptions() {
        System.out.println("--------------------------------------------------");
        System.out.println("Enter the number of the sorter you wish to use:");
        System.out.println("--------------------------------------------------");
        System.out.println("1.) Binary Sorter");
        System.out.println("2.) Merge Sorter Recursive");
        System.out.println("3.) Selection Sorter");
        System.out.println("4.) Bubble Sorter");
        System.out.println("5.) Quick Sorter");
        System.out.println("6.) Insertion Sorter");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

    }
    public static void printReturnedArray(int[] arrayToPrint) {
        for (int i=0; i<arrayToPrint.length; i++) {
            System.out.print("-" + arrayToPrint[i]+"-");
        }
    }
}

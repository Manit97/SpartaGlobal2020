package Runners;

import org.sorters.Sorter;

public class TimeCatcher {
    public void timer(Sorter sort, int [] arrayToSort){
        double start = System.nanoTime();
        sort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println(("Time in milliseconds: " + totalTime / 1000000));

    }
}

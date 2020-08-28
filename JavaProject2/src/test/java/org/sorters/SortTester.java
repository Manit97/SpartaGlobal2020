package org.sorters;
import org.junit.jupiter.api.Test;

public class SortTester {

    private void assertArrayEquals(int[] expected, int[] actual) {
    }

        @Test
        public void testMergeSort() {
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            MergeSort mergeSort = new MergeSort();
            mergeSort.sortArray(actual);
            assertArrayEquals(expected, actual);
        }
        @Test
        public void testBubbleSort(){
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            BubbleSort bubleSort = new BubbleSort();
            bubleSort.sortArray(actual);
            assertArrayEquals(expected, actual);
        }
        //    private void assertEquals(boolean b, boolean equals) {
//    }
        @Test
        public void testInsertionSort(){
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sortArray(actual);
            assertArrayEquals(expected, actual);
        }
        @Test
        public void testQuickSort(){
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            QuickSort quickSort = new QuickSort();
            quickSort.sortArray(actual);
            assertArrayEquals(expected, actual);
        }
        @Test
        public void testSelectionSort(){
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sortArray(actual);
            assertArrayEquals(expected, actual);
        }
}


//    @Test
////    public void testMergeSort() {
////        int[] actual = {5, 1, 6, 2, 3, 4};
////        int[] expected = {1, 2, 3, 4, 5, 6};
////        MergeSort.sorter(actual, actual.length);
////        assertArrayEquals(expected, actual);
////    }



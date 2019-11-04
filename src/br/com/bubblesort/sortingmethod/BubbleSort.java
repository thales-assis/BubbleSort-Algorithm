package br.com.bubblesort.sortingmethod;

/**
 * Bubble Sort Algorithm
 *
 * @author Thales Assis - https://github.com/thales-assis
 * @version 1.0
 * @since 2019-11-04
 *
 */
public class BubbleSort {

    /**
     *  Variable that will count how many comparisons were performed on the array.
     */
    private int comparisonCount;

    /**
     * Method that will sort the array using bubble sort.
     *
     * @param array Array to be ordered.
     */
    public void sort(int[] array) {
        sort(array, 0 , array.length);
    }

    /**
     * Method that will sort the array using Bubble Sort, but will only sort from start to end-1 position.
     *
     * @param array Array to be ordered.
     * @param start Start position at which to sort array.
     * @param end   End position that limits sort the array.
     */
    public void sort(int[] array, int start, int end) {
        if (start < 0 || end > array.length)
            return;

        comparisonCount = 0;
        boolean isOrdered = false;

        for (int i = start, j = 0; i < end - 1 && !isOrdered; i++, j++) {
            isOrdered = true;
            for (int k = start; k < end - 1 - j; k++) {
                comparisonCount++;
                if (array[k] > array[k+1]) {
                    isOrdered = false;
                    swap(array, k, k+1);
                }
            }
        }
    }

    /**
     * Swap array positions, exchanging a First Position with Second Position.
     *
     * @param array Array that will have position swap.
     * @param firstPosition first swap position.
     * @param secondPosition second swap position.
     */
    private void swap(int[] array, int firstPosition, int secondPosition) {
        int swap = array[secondPosition];
        array[secondPosition] = array[firstPosition];
        array[firstPosition] = swap;
    }

    /**
     *
     * @return number of comparisons performed to sort array.
     */
    public int getComparisonCount() {
        return this.comparisonCount;
    }

}

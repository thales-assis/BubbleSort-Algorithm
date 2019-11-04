package br.com.bubblesort.application;

import br.com.bubblesort.sortingmethod.BubbleSort;

/**
 * @author Thales Assis - https://github.com/thales-assis
 * @version 1.0
 */
public class Application {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] array1 = { 10, 34, 13, 5, 1, 67 };

        System.out.print("Array1 Before: ");
        printArray(array1);
        bubbleSort.sort(array1);

        System.out.print("Array1 After: ");
        printArray(array1);
        System.out.println("Comparison Count in Array1: " + bubbleSort.getComparisonCount());

//      ------------------------------------------------------------------------------------
        System.out.println();

        int[] array2 = { 12, 56, 2, 9, 89, 0, 15, 77, 10 };

        System.out.print("Array2 Before: ");
        printArray(array2);
        bubbleSort.sort(array2, 2, array2.length-2);

        System.out.print("Array2 After: ");
        printArray(array2);
        System.out.println("Comparison Count in Array2: " + bubbleSort.getComparisonCount());

    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

}

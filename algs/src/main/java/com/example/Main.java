package com.example;

import com.example.algs.BubbleSort;
import com.example.datastructs.Array;

public class Main {
    public static void main(String[] args) {
        String[] array = {"d", "x", "a", "u", "t", "z", "b"};
        Array<String> newArray = new Array<>(array);
        BubbleSort bubbleSort = new BubbleSort(newArray);
        System.out.print("Original Array: ");
        newArray.printArray();

        //bubbleSort.enableDebugMode();
        bubbleSort.sort();

        Array<String> sortedArray = bubbleSort.getArray();
        System.out.print("Sorted Array: ");
        sortedArray.printArray();
        System.out.printf("Number of Compares: %d\n", bubbleSort.getNumCompares());
        System.out.printf("Number of Swaps: %d\n", bubbleSort.getNumSwaps());
    }
}

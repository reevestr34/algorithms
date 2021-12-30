package com.example.algs;

import com.example.datastructs.Array;


public class BubbleSort extends Sort {

    public BubbleSort(Array array) {
        super(array);
    }

    /**
     * Sorts the array from least to most
     */
    public void sort() {
        numCompares = 0;
        numSwaps = 0;

        while (!isSorted()) {
            for (int i = 0; i < array.length() - 1; i++) {
                if (array.atIndex(i).compareTo(array.atIndex(i + 1)) > 0) {
                    int ret = array.swap(i, i + 1);
                    if (ret == 1 && debugMode) {
                        numSwaps++;
                        System.out.printf("Swapped %d:%s with %d:%s\n", i, array.atIndex(i), i + 1, array.atIndex(i + 1));
                        array.printArray();
                    } else if (ret == 1) {
                        numSwaps++;
                    }
                }
                numCompares++;
            }
        }
    }

    private boolean isSorted() {
        for (int i = 0; i < array.length() - 1; i++) {
            if (array.atIndex(i).compareTo(array.atIndex(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}

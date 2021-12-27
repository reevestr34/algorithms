package com.example.algs;

import com.example.datastructs.Array;


public class BubbleSort {
    private Array array;
    private int numSwaps;
    private int numCompares;
    private boolean debugMode;

    public BubbleSort(Array array) {
        this.numSwaps = 0;
        this.numCompares = 0;
        this.array = array;
        this.debugMode = false;
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

    public Array getArray() {
        return array;
    }

    public int getNumCompares() {
        return numCompares;
    }

    public int getNumSwaps() {
        return numSwaps;
    }

    public void enableDebugMode() {
        debugMode = true;
    }

    public void disableDebugMode() {
        debugMode = false;
    }
}

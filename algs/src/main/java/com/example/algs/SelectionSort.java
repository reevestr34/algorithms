package com.example.algs;

import com.example.datastructs.Array;

public class SelectionSort extends Sort{
    public SelectionSort(Array array) {
        super(array);
    }
    
    public void sort() {
        numCompares = 0;
        numSwaps = 0;

        for (int i = 0; i < array.length() - 1; i++) {
            int minIndex = getMinsIndex(i);
            array.swap(i, minIndex);
            if (debugMode) {
                System.out.printf("Swapped %d:%s with %d:%s\n", i, array.atIndex(i), i + 1, array.atIndex(i + 1));
                array.printArray();
            }
            numSwaps++;
        }
    }

    private int getMinsIndex(int startIndex) {
        int indexMin = startIndex;
        for (int i = startIndex + 1; i < array.length(); i++) {
            numCompares++;
            if (array.atIndex(i).compareTo(array.atIndex(indexMin)) < 0) {
                indexMin = i;
            }
        }
        return indexMin;
    }
}

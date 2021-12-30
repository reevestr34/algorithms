package com.example.algs;

import com.example.datastructs.Array;

public class InsertionSort extends Sort {

    public InsertionSort(Array array) {
        super(array);
    }

    public void sort() {
        numCompares = 0;
        numSwaps = 0;

        for (int i = 1; i < array.length(); i++) {
            walkDown(i);
        }
    }

    private void walkDown(int index) {
        while (array.atIndex(index).compareTo(array.atIndex(index - 1)) < 0) {
            numCompares++;
            numSwaps++;
            array.swap(index - 1, index);
            index--;
            if (index == 0) {
                break;
            }
        }
        numCompares++;
    }
}

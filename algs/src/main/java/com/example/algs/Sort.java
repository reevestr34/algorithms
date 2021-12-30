package com.example.algs;

import com.example.datastructs.Array;

public class Sort {
    Array array;
    int numSwaps;
    int numCompares;
    boolean debugMode;

    public Sort(Array array) {
        this.numSwaps = 0;
        this.numCompares = 0;
        this.array = array;
        this.debugMode = false;
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

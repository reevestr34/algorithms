package com.example.datastructs;

public class Array<Type extends Comparable<Type>> {
    Type[] array;
    public Array(Type[] inputArray) {
        array = inputArray;
    }

    /**
     * Swap objects with indices
     *
     * @param index1 index of object 1
     * @param index2 index of object 2
     * @return 1 on success, -1 on failure
     */
    public int swap(int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length ||
            index1 < 0 || index2 < 0) {
            return -1;
        }

        Type prev1 = array[index1];
        array[index1] = array[index2];
        array[index2] = prev1;
        return 1;
    }

    public int length() {
        return array.length;
    }

    /**
     * Get the object at a specified index
     *
     * @param index index of the object requested
     * @return object on success, or null on failure
     */
    public Type atIndex(int index) {
        if (index >= array.length || index < 0) {
            return null;
        }
        return array[index];
    }

    public void printArray() {
        System.out.print("[ ");
        for (Type obj : array) {
            System.out.printf("%s ", obj);
        }
        System.out.print("]\n");
    }
}

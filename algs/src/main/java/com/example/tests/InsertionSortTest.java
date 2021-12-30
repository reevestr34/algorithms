package com.example.tests;


import com.example.algs.InsertionSort;
import com.example.datastructs.Array;
import org.testng.annotations.Test;

public class InsertionSortTest {
    @Test
    public void testRandomChars() {
        Array<Character> array = new Array<>(TestHelper.generateRandomCharArray());

        assert(test(array));
    }

    @Test
    public void testRandomInts() {
        Array<Integer> array = new Array<>(TestHelper.generateRandomIntArray());

        assert(test(array));
    }

    public boolean test(Array array) {
        InsertionSort insertionSort = new InsertionSort(array);

        insertionSort.sort();
        Array<Character> sortedArray = insertionSort.getArray();

        return TestHelper.isSorted(sortedArray);
    }
}

package com.example.tests;


import com.example.algs.SelectionSort;
import com.example.datastructs.Array;
import org.testng.annotations.Test;

public class SelectionSortTest {
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
        SelectionSort selectionSort = new SelectionSort(array);

        selectionSort.sort();
        Array<Character> sortedArray = selectionSort.getArray();

        return TestHelper.isSorted(sortedArray);
    }
}

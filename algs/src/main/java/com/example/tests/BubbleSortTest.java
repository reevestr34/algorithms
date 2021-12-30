package com.example.tests;

import com.example.algs.BubbleSort;
import com.example.datastructs.Array;
import org.testng.annotations.Test;

public class BubbleSortTest {
    @Test
    public void testRandomChars() {
        Array<Character> array = new Array<>(TestHelper.generateRandomCharArray());
        BubbleSort bubbleSort = new BubbleSort(array);

        bubbleSort.sort();
        Array<Character> sortedArray = bubbleSort.getArray();

        assert(TestHelper.isSorted(sortedArray));
    }

    @Test
    public void testRandomInts() {
        Array<Integer> array = new Array<>(TestHelper.generateRandomIntArray());
        BubbleSort bubbleSort = new BubbleSort(array);

        bubbleSort.sort();
        Array<Integer> sortedArray = bubbleSort.getArray();

        assert(TestHelper.isSorted(sortedArray));
    }
}

package com.example.tests;

import com.example.datastructs.Array;

import java.util.Random;

public class TestHelper {
    public static Integer[] generateRandomIntArray() {
        Random random = new Random();
        int arraySize = random.nextInt(100);
        Integer[] array = new Integer[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return array;
    }

    public static Character[] generateRandomCharArray() {
        Random random = new Random();
        int arraySize;
        do {
            arraySize = random.nextInt(100);
        } while (arraySize == 0);

        Character[] array = new Character[arraySize];

        int min = 97;
        int max = 122 + 1;

        for (int i = 0; i < arraySize; i++) {
            Character ch = (char) (random.nextInt(max - min) + min);
            array[i] = ch;
        }
        return array;
    }

    public static boolean isSorted(Array array) {
        for (int i = 0; i < array.length() - 1; i++) {
            for (int j = i; j < array.length(); j++) {
                if (array.atIndex(i).compareTo(array.atIndex(j)) > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

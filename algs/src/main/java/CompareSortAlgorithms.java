import com.example.algs.BubbleSort;
import com.example.algs.InsertionSort;
import com.example.algs.SelectionSort;
import com.example.datastructs.Array;
import com.example.tests.TestHelper;

public class CompareSortAlgorithms {
    public static void main(String[] args) {
        Character[] charArray = TestHelper.generateRandomCharArray();

        Array<Character> array = new Array<>(charArray);

        Array<Character> arrayBubble = new Array<>(charArray.clone());
        Array<Character> arraySelection = new Array<>(charArray.clone());
        Array<Character> arrayInsertion = new Array<>(charArray.clone());
        array.printArray();

        System.out.printf("N: %d\n", array.length());
        System.out.printf("N^2: %d\n", array.length() * array.length());

        BubbleSort bubbleSort = new BubbleSort(arrayBubble);
        SelectionSort selectionSort = new SelectionSort(arraySelection);
        InsertionSort insertionSort = new InsertionSort(arrayInsertion);

        bubbleSort.sort();
        selectionSort.sort();
        insertionSort.sort();

        System.out.println("\nBubbleSort:");
        bubbleSort.getArray().printArray();
        System.out.printf("\tC: %d\tS: %d\n", bubbleSort.getNumCompares(), bubbleSort.getNumSwaps());

        System.out.println("SelectionSort:");
        selectionSort.getArray().printArray();
        System.out.printf("\tC: %d\tS: %d\n", selectionSort.getNumCompares(), selectionSort.getNumSwaps());

        System.out.println("InsertionSort:");
        insertionSort.getArray().printArray();
        System.out.printf("\tC: %d\tS: %d\n", insertionSort.getNumCompares(), insertionSort.getNumSwaps());
    }
}

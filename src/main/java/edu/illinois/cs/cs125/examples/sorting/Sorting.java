package edu.illinois.cs.cs125.sortlib;

public class Sorting {
    @SuppressWarnings("unused")
    public static void mergeSort(final int[] inputArray) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int tmp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }
}

package org.example;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // Linear Search Test

        int[] linearArray = {2, 4, 7, 10, 11, 32, 45, 87};

        int linearKey = 32;

        int linearResult = LinearSearch.search(linearArray, linearKey);

        if (linearResult == -1) {
            System.out.println("Linear Search: " + linearKey + " was not found.");
        }
        else {
            System.out.println("Linear Search: " + linearKey + " found at index " + linearResult);
        }

        // ---------------------------------------------------------------------------------------
        // Binary Search Test

        int[] binaryArray = {2, 4, 7, 10, 11, 32, 45, 87};

        int binaryKey = 32;

        int binaryResult = BinarySearch.runBinarySearchIteratively(binaryArray, binaryKey, 0, binaryArray.length - 1);

        if (binaryResult == Integer.MAX_VALUE) {
            System.out.println("Binary Search: " + binaryKey + " was not found.");
        }
        else {
            System.out.println("Binary Search: " + binaryKey + " found at index " + binaryResult);
        }

        // ---------------------------------------------------------------------------------------
        // Bubble Sort Test

        int[] bubbleArray = {45, 7, 32, 2, 87, 10, 4, 11};

        System.out.println("Before Bubble Sort: " + Arrays.toString(bubbleArray));

        BubbleSort.bubbleSort(bubbleArray, bubbleArray.length);

        System.out.println("After Bubble Sort:  " + Arrays.toString(bubbleArray));

        // ---------------------------------------------------------------------------------------
        // Sum of Primes Test

        int n = 10;

        long primeSum = Problem01.getSumOfPrimes(n);

        System.out.println("Sum of prime numbers between 1 and " + n + ": " + primeSum);
    }
}
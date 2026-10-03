package org.example;

public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {

        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    // Todo 2: Call the above method and test the algorithm, provide time and space analysis

}

/*
Time Complexity Analysis:

Best case: Theta(1)
The key is equal to the middle element during the first comparison,
so the algorithm finishes immediately.

Average case: Theta(log n)
Worst case: Theta(log n)

During each iteration, binary search eliminates approximately
half of the remaining elements.

For example:

n
n / 2
n / 4
n / 8
...

After k iterations:

n / 2^k = 1

Therefore:

2^k = n

and:

k = log2(n)

So the number of iterations grows logarithmically.

Space Complexity: Theta(1)

This implementation is iterative and only uses a fixed number
of variables: index, low, high, and mid.

No additional array or data structure grows with n.
*/
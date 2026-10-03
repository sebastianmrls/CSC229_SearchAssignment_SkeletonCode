package org.example;

public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up

                // Todo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {

                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }

    }
}

/*
Time Complexity Analysis:

The outer loop runs approximately n times.

The inner loop does not run exactly n times on every iteration.
It runs:

n - 1 times,
n - 2 times,
n - 3 times,
...
1 time.

Therefore, the total number of comparisons is:

(n - 1) + (n - 2) + ... + 1

This sum is:

n(n - 1) / 2

Expanding:

(n^2 - n) / 2

In asymptotic analysis, constant factors and lower-order
terms are ignored, so the dominant term is n^2.

Therefore:

Best case: Theta(n^2)
Average case: Theta(n^2)
Worst case: Theta(n^2)

The best case is also Theta(n^2) because this implementation
does not stop early when the array is already sorted.
The nested loops still perform all of the comparisons.

Space Complexity: Theta(1)

Bubble sort modifies the original array directly and only uses
a fixed number of variables: outer, inner, and temp.
No additional storage grows with n.
*/
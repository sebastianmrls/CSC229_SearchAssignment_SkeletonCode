package org.example;

public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;

        // Todo 01: complete the implementation of linear search and test your code, provide asymptotic analysis of the developed solution
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }
}

/*
Asymptotic Analysis

Time Complexity:

Best case: Theta(1)
The value being searched for is the first element of the array.
Only one comparison is needed, regardless of the size of the array.

Average case: Theta(n)
On average, the algorithm examines approximately n / 2 elements.
Since constant factors are ignored in asymptotic analysis,
n / 2 grows linearly with n.

Worst case: Theta(n)
The value is either the last element of the array or is not present.
In this case, all n elements must be examined.

Space Complexity: Theta(1)
The algorithm only uses a fixed number of variables such as n and i.
No additional data structure grows with the size of the input.
*/
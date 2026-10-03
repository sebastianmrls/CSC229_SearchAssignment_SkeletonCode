package org.example;

public class Problem01 {

    public static long getSumOfPrimes(int n) {

        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n, test your solution, analyze space and time

        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;

    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Time Complexity Analysis:

getSumOfPrimes examines every integer from 2 through n,
so the outer loop runs approximately n times.

For every number, the isPrime method may test divisors
starting at 2 and continuing while:

i * i <= number

This means that, in the worst case, isPrime checks divisors
up to the square root of the number.

Therefore, one call to isPrime has an upper bound of:

O(sqrt(n))

getSumOfPrimes may call isPrime approximately n times.

Therefore the upper bound for the total running time is:

O(n * sqrt(n))

This is an upper bound because many composite numbers are
detected before reaching sqrt(n). For example, an even number
will immediately be found divisible by 2.

Space Complexity: Theta(1)

The program only uses a fixed number of variables such as
sum, i, number, and divisor.

No array, list, or other data structure grows as n increases.
Therefore the amount of additional memory remains constant.
*/
package part1._1_basic_programming_model.exercises;

import java.util.Arrays;

/**
 * 1.1.15 Write a static method histogram() that takes an array a[] of int values and
 * an integer M as arguments and returns an array of length M whose ith entry is the number
 * of times the integer i appeared in the argument array. If the values in a[] are all
 * between 0 and M–1, the sum of the values in the returned array should be equal to
 * a.length.
 **/

public class Exercise_1_1_15 {

    private static int[] histogram(int[] a, int M) {
        int[] newArr = new int[M];
        System.out.println(exR1(6));
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] <= M - 1) {
                newArr[a[i]]++;
            }
        }

        return newArr;
    }

    public static String exR1(int n)
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 1, 3, 4, 2, 3, 1, 0, 0, 1, 1};
        int length = arr.length;

        System.out.println(Arrays.toString(arr));
        arr = histogram(arr, 5);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum == length);
    }
}

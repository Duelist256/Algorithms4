package part1._1_basic_programming_model.exercises;

import java.util.Scanner;

/**
 * 1.1.22 Write a version of BinarySearch that uses the recursive rank() given on page
 * 25 and traces the method calls. Each time the recursive method is called, print the argument
 * values lo and hi, indented by the depth of the recursion. Hint: Add an argument
 * to the recursive method that keeps track of the depth.
 **/

public class Exercise_1_1_22 {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, "");
    }

    public static int rank(int key, int[] a, int lo, int hi, String depth) {
        System.out.println(depth + "lo = " + lo + ", hi = " + hi);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        depth = depth + " ";
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 15, 28, 42, 56, 72, 100, 110, 115, 150};
        System.out.println(rank(28, arr));
    }
}

package part1._1_basic_programming_model.exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.23 Add to the BinarySearch test client the ability to respond to a second argument:
 * + to print numbers from standard input that are not in the whitelist, - to print
 * numbers that are in the whitelist.
 **/

public class Exercise_1_1_23 {

    public static int rank(int key, int[] a) { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        String secondArg = args[1];

        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (secondArg.equals("-")) {
                for (int num : whitelist) {
                    System.out.println(num);
                }
            }

            if (secondArg.equals("+")) {
                StdOut.println(key);
            }
        }
    }
}

package part1._1_basic_programming_model.exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* *
 * 1.1.28 Remove duplicates. Modify the test client in BinarySearch to remove any duplicate
 * keys in the whitelist after the sort.
 * */

public class Exercise_1_1_28 {
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
        int[] whitelist = in.readAllInts();

        whitelist = removeDuplicates(whitelist);

        Arrays.sort(whitelist);
        System.out.println(Arrays.toString(whitelist));
        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }

    private static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int element : array) {
            set.add(element);
        }
        array = new int[set.size()];
        int i = 0;
        for (Integer elem : set) {
            array[i++] = elem;
        }

        return array;
    }
}

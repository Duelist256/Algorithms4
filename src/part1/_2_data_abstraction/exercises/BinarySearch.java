package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.Counter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Instrument BinarySearch (page 47) to use a Counter to count the total number
 * of keys examined during all searches and then print the total after all searches are complete.
 * Hint : Create a Counter in main() and pass it as an argument to rank().
 **/
public class BinarySearch
{
    public static int rank(int key, int[] a, Counter counter)
    { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        { // Key is in a[lo..hi] or not present.
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        int[] arr = {-5, -4, -3, -1, 0, 3, 5, 7, 10};
        Arrays.sort(arr);
        Counter counter = new Counter("MyCounter");
        System.out.println(counter.tally());
        rank(key, arr, counter);
        System.out.println(counter.tally());
    }
}

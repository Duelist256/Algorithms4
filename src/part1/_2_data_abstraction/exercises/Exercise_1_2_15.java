package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

/**
 * 1.2.15. File input. Develop a possible implementation of the static readInts() method
 * from In (which we use for various test clients, such as binary search on page 47) that
 * is based on the split() method in String.
 **/

public class Exercise_1_2_15 {

    public static int[] readInts(String name) {
        In in = new In(name);
        String[] strings = in.readAll().split("\n");

        int[] arr = new int[strings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(strings[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = readInts("tinyW.txt");
        System.out.println(Arrays.toString(arr));
    }
}

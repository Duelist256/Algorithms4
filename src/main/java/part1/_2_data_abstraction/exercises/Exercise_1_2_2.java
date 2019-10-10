package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Point2D;

import java.util.Scanner;

/**
 * 1.2.2 Write an Interval1D client that takes an int value N as command-line argument,
 * reads N intervals (each defined by a pair of double values) from standard input,
 * and prints all pairs that intersect.
 **/

public class Exercise_1_2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = scanner.nextInt();

        Interval1D[] intervals = inputIntervals(n);
        printIntersectedPairs(intervals);
    }

    private static void printIntersectedPairs(Interval1D[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    System.out.println(intervals[i] + " intersects " + intervals[j]);
                }
            }
        }
    }

    private static Interval1D[] inputIntervals(int n) {
        Interval1D[] intervals = new Interval1D[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            intervals[i] = new Interval1D(min, max);
        }

        return intervals;
    }


}

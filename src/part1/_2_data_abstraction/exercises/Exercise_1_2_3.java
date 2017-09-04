package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * 1.2.3 Write an Interval2D client that takes command-line arguments N, min, and max
 * and generates N random 2D intervals whose width and height are uniformly distributed
 * between min and max in the unit square. Draw them on StdDraw and print the number
 * of pairs of intervals that intersect and the number of intervals that are contained in one
 * another.
 **/

public class Exercise_1_2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double min = scanner.nextDouble();
        double max = scanner.nextDouble();

        Interval1D[][] intervals1d = new Interval1D[n][2];

        Interval2D[] intervals = new Interval2D[n];
        for (int i = 0; i < intervals.length; i++) {

            double first = StdRandom.uniform(min, max);
            double second = StdRandom.uniform(first, max);
            Interval1D width = new Interval1D(first, second);

            first = StdRandom.uniform(min, max);
            second = StdRandom.uniform(first, max);
            Interval1D height = new Interval1D(first, second);

            intervals1d[i][0] = width;
            intervals1d[i][1] = height;

            intervals[i] = new Interval2D(width, height);
        }

        drawIntervals(intervals);

        int totalIntersects = countIntersects(intervals);
        System.out.println("Total intersects = " + totalIntersects);

        int totalContains = countContains(intervals1d);
        System.out.println("Total contains = " + totalContains);
    }

    private static int countIntersects(Interval2D[] intervals) {
        int totalIntersects = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    totalIntersects++;
                }
            }
        }
        return totalIntersects;
    }

    private static void drawIntervals(Interval2D[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            intervals[i].draw();
        }
    }

    private static int countContains(Interval1D[][] intervals1d) {
        int totalContains = 0;
        for (int i = 0; i < intervals1d.length; i++) {
            for (int j = i + 1; j < intervals1d.length; j++) {
                if ((intervals1d[i][0].min() > intervals1d[j][0].min()
                        && intervals1d[i][1].min() > intervals1d[j][1].min()
                        && intervals1d[i][0].max() < intervals1d[j][0].max()
                        && intervals1d[i][1].max() < intervals1d[j][1].max())
                        ||
                        (intervals1d[i][0].min() < intervals1d[j][0].min()
                        && intervals1d[i][1].min() < intervals1d[j][1].min()
                        && intervals1d[i][0].max() > intervals1d[j][0].max()
                        && intervals1d[i][1].max() > intervals1d[j][1].max())) {
                    totalContains++;
                }
            }
        }
        return totalContains;
    }

}

package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.Point2D;
import java.util.Scanner;

/**
 * 1.2.1 Write a Point2D client that takes an integer value N from the command line,
 * generates N random points in the unit square, and computes the distance separating
 * the closest pair of points.
 **/

public class Exercise_1_2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Point2D[] points= generatePoints(n);

        double closest = findClosest(points);

        System.out.println(closest);
    }

    private static Point2D[] generatePoints(int n) {
        Point2D[] points = new Point2D[n];

        for (int i = 0; i < n; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
        }

        return points;
    }

    private static double findClosest(Point2D[] points) {
        double closest = 1.1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double distance = points[i].distanceSquaredTo(points[j]);
                if (distance < closest) {
                    closest = distance;
                }
            }
        }
        return closest;
    }
}

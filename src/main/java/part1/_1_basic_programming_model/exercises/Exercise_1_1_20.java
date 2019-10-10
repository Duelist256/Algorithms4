package part1._1_basic_programming_model.exercises;

import java.util.Arrays;

/**
 * 1.1.20 Write a recursive static method that computes the value of ln(N!)
 **/

public class Exercise_1_1_20 {

    public static void main(String[] args) {
        System.out.println(lnFact(1));
        System.out.println(lnFact(2));
        System.out.println(lnFact(5));
        System.out.println(lnFact(10));
    }

    private static double lnFact(int n) {
        if (n < 0) {
            throw new RuntimeException("Number cannot be negative");
        }

        if (n <= 1) {
            return 0.0;
        }
        return Math.log(n) + lnFact(n - 1);
    }
}

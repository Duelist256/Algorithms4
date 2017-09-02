package part1._1_basic_programming_model.exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * 1.1.3 Write a program that takes three integer command-line arguments
 * and prints equal if all three are equal, and not equal otherwise.
 **/

public class Exercise_1_1_5 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
//        System.out.println(foo());
    }

    private static boolean foo() {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        return first >= 0.0 && first <= 1.0 && second  >= 0.0 && second <= 1.0;

    }
}

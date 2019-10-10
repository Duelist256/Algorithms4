package part1._1_basic_programming_model.exercises;

import java.util.Scanner;

/**
 * 1.1.5 Write a code fragment that prints true if the double variables
 * x and y are both strictly between 0 and 1 and false otherwise.
 **/

public class Exercise_1_1_5 {
    public static void main(String[] args) {
        System.out.println(foo());
    }

    private static boolean foo() {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        return first >= 0.0 && first <= 1.0 && second  >= 0.0 && second <= 1.0;

    }
}

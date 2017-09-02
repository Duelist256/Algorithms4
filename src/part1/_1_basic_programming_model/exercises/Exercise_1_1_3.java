package part1._1_basic_programming_model.exercises;

import java.util.Scanner;

/**
 * 1.1.3 Write a program that takes three integer command-line arguments
 * and prints equal if all three are equal, and not equal otherwise.
 **/

public class Exercise_1_1_3 {
    public static void main(String[] args) {
        System.out.println(foo());
    }

    private static boolean foo() {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        return first == second && second == third;
    }
}

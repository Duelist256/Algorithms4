package part1._1_basic_programming_model.exercises;

import java.util.Scanner;

/**
 * 1.1.21 Write a program that reads in lines from standard input with each line containing
 * a name and two integers and then uses printf() to print a table with a column of
 * the names, the integers, and the result of dividing the first by the second, accurate to
 * three decimal places. You could use a program like this to tabulate batting averages for
 * baseball players or grades for students.
 **/

public class Exercise_1_1_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] firstNumbers = new int[n];
        int[] secondNumbers = new int[n];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] strings = scanner.nextLine().split(" ");
            names[i] = strings[0];
            firstNumbers[i] = Integer.parseInt(strings[1]);
            secondNumbers[i] = Integer.parseInt(strings[2]);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %2d %2d %6.3f\n", names[i], firstNumbers[i], secondNumbers[i], (double) firstNumbers[i]/secondNumbers[i]);
        }
    }
}

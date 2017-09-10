package part1._1_basic_programming_model.exercises;

import java.util.Arrays;

/**
 * 1.1.19. Develop a better implementation of F(N) that saves computed values in
 * an array.
 **/

public class Exercise_1_1_19 {

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(47));
        System.out.println(fib(48));
        System.out.println(fib(49));
        System.out.println(fib(50));
        System.out.println(fib(60));
        System.out.println(fib(92)); // max
//        System.out.println(fib(93)); -6246583658587674878
    }

    private static long fib(int n) {
        long[] arr = new long[n + 1];
        return fib(n, arr);
    }

    private static long fib(int n, long[] arr) {
        if (n < 0) {
            throw new IllegalArgumentException("wrong");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (arr[n] == 0) {
            arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
        }

        return arr[n];
    }

}

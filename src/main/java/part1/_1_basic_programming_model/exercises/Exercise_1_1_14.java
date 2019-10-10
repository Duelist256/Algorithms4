package part1._1_basic_programming_model.exercises;

/**
 * 1.1.14 Write a static method lg() that takes an int value N as argument and returns
 * the largest int not larger than the base-2 logarithm of N. Do not use Math.
 **/

public class Exercise_1_1_14 {
    public static void main(String[] args) {
        System.out.println(lg(1));
        System.out.println(lg(2));
        System.out.println(lg(4));
        System.out.println(lg(8));
        System.out.println(lg(16));
        System.out.println(lg(32));
        System.out.println(lg(64));
        System.out.println(lg(128));
        System.out.println(lg(256));
        System.out.println(lg(512));
        System.out.println(lg(1024));
        System.out.println(lg(2048));
        System.out.println(lg(16384));
    }

    private static int lg(int n) {
        int result = 0;

        while (n != 1) {
            n /= 2;
            result++;
        }

        return result;
    }

}

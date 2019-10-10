package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * 1.2.6 A string s is a circular rotation of a string t if it matches when the characters
 * are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
 * TGACGAC, and vice versa. Detecting this condition is important in the study of genomic
 * sequences. Write a program that checks whether two given strings s and t are circular
 * shifts of one another. Hint : The solution is a one-liner with indexOf(), length(), and
 * string concatenation.
 **/

public class Exercise_1_2_6 {

    public static void main(String[] args) {
        String s1 = "TGACGAC";
        String s2 = "ACTGACG";
        System.out.println(isCircularShift(s1, s2));
    }

    private static boolean isCircularShift(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
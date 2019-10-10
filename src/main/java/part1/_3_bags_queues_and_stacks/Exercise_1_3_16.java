package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

import java.util.Arrays;

/**
 * 1.3.16 Using readInts() on page 126 as a model, write a static method readDates() for
 * Date that reads dates from standard input in the format specified in the table on page 119
 * and returns an array containing them.
 **/

public class Exercise_1_3_16 {
    public static Date[] readDates(String name) {
        In in = new In(name);
        Queue<Date> q = new Queue<>();
        while (!in.isEmpty())
            q.enqueue(new Date(in.readLine()));
        int N = q.size();
        Date[] dates = new Date[N];
        for (int i = 0; i < N; i++)
            dates[i] = q.dequeue();
        return dates;
    }

    public static void main(String[] args) {
        Date[] dates = readDates("dates.txt");
        System.out.println(Arrays.toString(dates));
    }
}

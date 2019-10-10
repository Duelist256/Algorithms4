package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Transaction;

/**
 * 1.3.17 Do Exercise 1.3.16 for Transaction.
 **/

public class Exercise_1_3_17 {
    public static Transaction[] readTransactions(String name) {
        In in = new In(name);
        Queue<Transaction> q = new Queue<>();
        while (!in.isEmpty())
            q.enqueue(new Transaction(in.readLine()));
        int N = q.size();
        Transaction[] dates = new Transaction[N];
        for (int i = 0; i < N; i++)
            dates[i] = q.dequeue();
        return dates;
    }

    public static void main(String[] args) {
        Transaction[] transactions = readTransactions("transactions.txt");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

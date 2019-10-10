package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Queue;

import java.util.Scanner;

/**
 * 1.3.15 Write a Queue client that takes a command-line argument k and prints the kth
 * from the last string found on standard input (assuming that standard input has k or
 * more strings).
 **/


public class QueueClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Queue<String> queue = new Queue<>();

        for (int i = 0; i < n; i++) {
            queue.enqueue(scanner.nextLine());
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        if (queue.size() >= k) {
            for (int i = 0; i < k; i++) {
                queue.dequeue();
            }
            System.out.println(queue.dequeue());
        } else {
            System.out.println("k is less than total count of strings");
        }
    }
}

package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

/**
 * 1.3.12 Write an iterable Stack client that has a static method copy() that takes a stack
 * of strings as argument and returns a copy of the stack. Note : This ability is a prime
 * example of the value of having an iterator, because it allows development of such functionality
 * without changing the basic API.
 **/

public class StackClient {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println("Original:");
        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println("\nCopy:");

        Stack<String> stackCopy = copy(stack);
        for (String s : stackCopy) {
            System.out.println(s);
        }
    }

    public static Stack<String> copy(Stack<String> stack) { // 2N
        Stack<String> stack1 = new Stack<>();
        for (String s: stack) {
            stack1.push(s);
        }

        Stack<String> stack2 = new Stack<>();
        for (String s: stack1) {
            stack2.push(s);
        }

        return stack2;
    }

}

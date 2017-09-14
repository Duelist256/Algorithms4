package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

import java.util.Scanner;

/**
 * 1.3.9 Write a program that takes from standard input an expression without left parentheses
 * and prints the equivalent infix expression with the parentheses inserted. For
 * example, given the input:
 **/

public class Exercise_1_3_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Stack<String> exprs = new Stack<>();
        Stack<String> op = new Stack<>();
        Stack<String> nums = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                op.push("" + c);
            }

            if (Character.isDigit(c)) {
                nums.push("" + c);
            }

            if (c == ')') {
                String expression = "";
                if (nums.size() == 1) {
                    expression = "( " + nums.pop() + " " + c;
                } else {
                    String exp1 = nums.pop();
                    String exp2 = nums.pop();
                    expression = "( " + exp2 + " " + op.pop() + " " + exp1 + " "+ c;
                    while (!nums.isEmpty()) {
                        expression = nums.pop() + " " + op.pop() + " " + expression;
                    }
                }

                System.out.println(expression);
                nums.push(expression);
            }

        }
        System.out.println(nums.pop());
    }
}

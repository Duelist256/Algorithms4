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

        Stack<String> operations = new Stack<>();
        Stack<String> expressions = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operations.push("" + c);
            }

            if (Character.isDigit(c)) {
                expressions.push("" + c);
            }

            if (c == ')') {
                String expression = "";
                if (expressions.size() == 1) {
                    expression = "( " + expressions.pop() + " " + c;
                } else {
                    String exp1 = expressions.pop();
                    String exp2 = expressions.pop();
                    expression = "( " + exp2 + " " + operations.pop() + " " + exp1 + " "+ c;
                    while (!expressions.isEmpty()) {
                        expression = expressions.pop() + " " + operations.pop() + " " + expression;
                    }
                }
                expressions.push(expression);
            }

        }
        System.out.println(expressions.pop());
    }
}

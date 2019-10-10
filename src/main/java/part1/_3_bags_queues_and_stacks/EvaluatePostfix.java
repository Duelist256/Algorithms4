package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

/**
 * 1.3.11. Write a program EvaluatePostfix that takes a postfix expression from standard
 * input, evaluates it, and prints the value. (Piping the output of your program from
 * the previous exercise to this program gives equivalent behavior to Evaluate.
 **/

public class EvaluatePostfix {

    public static void main(String[] args) {
        // (A * B) / C = AB*C/

        System.out.println(evaluate("58*4/"));

        System.out.println(evaluate("1234*+*5+"));
        System.out.println(evaluate("123^*4+"));
        System.out.println(evaluate("12-3+"));
        System.out.println(evaluate("123+*"));
        System.out.println(evaluate("123*+"));

    }

    public static int evaluate(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }

            if (ch == '^') {
                double first = stack.pop();
                double second = stack.pop();
                int result1 = (int) Math.pow(second, first);
                stack.push(result1);
            }

            if (ch == '*') {
                int first = stack.pop();
                int second = stack.pop();
                int result1 = second * first;
                stack.push(result1);
            }

            if (ch == '/') {
                int first = stack.pop();
                int second = stack.pop();
                int result1 = second / first;
                stack.push(result1);
            }

            if (ch == '+') {
                int first = stack.pop();
                int second = stack.pop();
                int result1 = second + first;
                stack.push(result1);
            }

            if (ch == '-') {
                int first = stack.pop();
                int second = stack.pop();
                int result1 = second - first;
                stack.push(result1);
            }
        }

        return stack.peek();
    }
}

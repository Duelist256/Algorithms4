package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

/**
 * 1.3.10 Write a filter InfixToPostfix that converts an arithmetic expression from infix
 * to postfix.
 **/

public class InfixToPostfix {



    public static void main(String[] args) {
        System.out.println(convert("1*(2+3*4)+5"));
        System.out.println(convert("1*2^3+4"));
        System.out.println(convert("1-2+3"));
        System.out.println(convert("1*(2+3)"));
        System.out.println(convert("1+2*3"));
    }

    public static String convert(String s) {
        String newString = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                newString += ch;
            }

            if (ch == '(') {
                stack.push(ch);
            }

            if (ch == ')') {
                while (stack.peek() != '(') {
                    newString += stack.pop();
                }
                stack.pop();
            }

            if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^') {
                while (!stack.isEmpty() && getPrecendence(ch) <= getPrecendence(stack.peek())) {
                    newString += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            newString += stack.pop();
        }

        return newString;
    }

    private static int getPrecendence(char ch) {

        if (ch == '^') {
            return 2;
        }

        if (ch == '*' || ch == '/') {
            return 1;
        }

        if (ch == '+' || ch == '-') {
            return 0;
        }

        return -1;
    }
}

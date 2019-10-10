package part1._3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

/**
 * 1.3.4 Write a stack client Parentheses that reads in a text stream from standard input
 * and uses a stack to determine whether its parentheses are properly balanced. For example,
 * your program should print true for [()]{}{[()()]()} and false for [(]).
 **/

public class Parentheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("[()]{}{[()()]()}"));
        System.out.println(isBalanced("[(])"));
        System.out.println(isBalanced("((())[{}])"));
        System.out.println(isBalanced("(([)]{)}"));
        System.out.println(isBalanced("((((([])))))"));
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }

            if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }

            if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }

        return true;
    }
}

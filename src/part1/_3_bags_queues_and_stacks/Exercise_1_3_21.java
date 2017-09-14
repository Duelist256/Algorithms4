package part1._3_bags_queues_and_stacks;

import java.util.LinkedList;

/**
 * 1.3.21 Write a method find() that takes a linked list and a string key as arguments
 * and returns true if some node in the list has key as its item field, false otherwise.
 **/

public class Exercise_1_3_21 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(find(list, "three"));
        System.out.println(find(list, "eight"));
        System.out.println(find(list, "four"));
        System.out.println(find(list, "seven"));
    }

    public static boolean find(LinkedList<String> list, String key) {
        return list.contains(key);
    }
}

package part1._3_bags_queues_and_stacks;

/**
 * 1.3.7 Add a method peek() to Stack that returns the most recently inserted item on
 * the stack (without popping it).
 **/

public class StackWithPeek<Item> {
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    } // Or: N == 0.

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Item peek() {
        if (!isEmpty()) {
            return first.item;
        } else {
            return null;
        }
    }
}

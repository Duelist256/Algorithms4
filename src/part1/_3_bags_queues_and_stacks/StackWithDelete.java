package part1._3_bags_queues_and_stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 1.3.20 Write a method delete() that takes an int argument k and deletes the kth element
 * in a linked list, if it exists.
 **/

public class StackWithDelete<Item> implements Iterable<Item>{

    private StackWithDelete.Node<Item> first;     // top of stack
    private int n;                // size of the stack

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private StackWithDelete.Node<Item> next;
    }

    public StackWithDelete() {
        first = null;
        n = 0;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        StackWithDelete.Node<Item> oldfirst = first;
//        first = new StackWithDelete<>().Node<Item>();
        first = new StackWithDelete.Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Removes and returns the item most recently added to this stack.
     *
     * @return the item most recently added
     * @throws NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }


    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    public Item delete(int index) {
        Node current = first;
        Node prev = null;

        int i = 0;
        while (current != null) {

            if (i == index) {
                Item result = (Item) current.item;
                if (prev == null) {
                    first = first.next;
                } else {
                    prev.next = current.next;
                }
                n--;
                return result;
            }

            prev = current;
            current = current.next;
            i++;
        }

        throw new NoSuchElementException();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    public Iterator<Item> iterator() {
        return new StackWithDelete<>().new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private StackWithDelete.Node<Item> current;

        public ListIterator(StackWithDelete.Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    public static void main(String[] args) {
        StackWithDelete<String> stack = new StackWithDelete<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack);
        System.out.println(stack.size());

        String deleted = stack.delete(1);
        System.out.println(deleted);

        System.out.println(stack);
        System.out.println(stack.size());
    }
}

package part1._3_bags_queues_and_stacks;

/**
 * 1.3.14 Develop a class ResizingArrayQueueOfStrings that implements the queue
 * abstraction with a fixed-size array, and then extend your implementation to use array
 * resizing to remove the size restriction.
 **/

public class ResizingArrayQueueOfStrings {

    private String[] elements;
    private int size;
    private int pointer;

    public ResizingArrayQueueOfStrings(int size) {
        elements = new String[size];
    }


    public static void main(String[] args) {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(5);
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");


        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());

        System.out.println();

        queue.enqueue("two");
        queue.enqueue("three");
        queue.enqueue("one");
        queue.enqueue("five");
        queue.enqueue("four");
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    private String dequeue() {

        String result = null;

        if (elements[pointer] != null) {
            result = elements[pointer];
            elements[pointer++] = null;
            size--;
        }

        if (size == 0) {
            pointer = 0;
        }

        return result;
    }

    private void enqueue(String item) {
        if (size >= elements.length) {
            throw new RuntimeException("Queue is full");
        }
        elements[size++] = item;
    }

    public int getSize() {
        return size;
    }
}

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

    private String dequeue() {
        if (size <= 0) {
            throw new RuntimeException("Queue is empty");
        }

        String result = elements[pointer];
        elements[pointer++] = null;
        size--;

        if (size == 0) {
            pointer = 0;
        }

        if (size <= elements.length / 4) {
            String[] newElements = new String[elements.length / 2];
            for (int i = pointer, j = 0; i < pointer + size; i++, j++) {
                newElements[j] = elements[i];
            }
            elements = newElements;
            pointer = 0;
        }

        return result;
    }

    public void enqueue(String elem) {
        if (size >= elements.length) {
            String[] newElements = new String[elements.length * 2];
            for (int i = pointer, j = 0; i < pointer + size; i++, j++) {
                newElements[j] = elements[i];
            }
            elements = newElements;
            pointer = 0;
        }
        elements[size++] = elem;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(5);
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        queue.enqueue("four");
        queue.enqueue("five");

        System.out.println(queue.getSize());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        for (int i = 1; i <= 10; i++) {
            queue.enqueue("elem" + i);
        }
        System.out.println(queue.getSize());

        for (int i = 1; i <= 10; i++) {
            System.out.println(queue.dequeue());
        }
    }
}

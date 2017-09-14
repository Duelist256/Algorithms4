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
        queue.enqueue("four");
        queue.enqueue("five");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue("elem1");
        queue.enqueue("elem2");
        queue.enqueue("elem3");
        queue.enqueue("elem4");
        queue.enqueue("elem5");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    private String dequeue() {
        if (size <= 0) {
            throw new RuntimeException("Queue is empty");
        }

        String result = elements[pointer++];
        size--;

        if (size == 0) {
            pointer = 0;
        }

        return result;
    }

    public void enqueue(String elem) {
        if (size >= elements.length) {
            throw new RuntimeException("Queue is full");
        }
        elements[size++] = elem;
    }

    public int getSize() {
        return size;
    }
}

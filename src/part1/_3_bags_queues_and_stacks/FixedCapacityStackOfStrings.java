package part1._3_bags_queues_and_stacks;

/**
 * 1.3.1 Add a method isFull() to FixedCapacityStackOfStrings.
 **/

public class FixedCapacityStackOfStrings
{
    private String[] a; // stack entries
    private int N; // size

    public FixedCapacityStackOfStrings(int cap)
    { a = new String[cap]; }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return  N == a.length;
    }

    public int size() {
        return N;
    }

    public void push(String item)
    {
        a[N++] = item;
    }

    public String pop()
    {
        return a[--N];
    }
}
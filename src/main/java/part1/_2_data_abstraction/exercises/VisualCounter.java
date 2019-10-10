package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 1.2.10 Develop a class VisualCounter that allows both increment and decrement
 * operations. Take two arguments N and max in the constructor, where N specifies the
 * maximum number of operations and max specifies the maximum absolute value for
 * the counter. As a side effect, create a plot showing the value of the counter each time its
 * tally changes.
 **/

public class VisualCounter {

    final private int maxNumberOfOperations;
    final private int maxValueOfCounter;

    private int count;
    private int numberOfOperations;

    private double x = 0.05;
    private double y = 0.05;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public VisualCounter(int n, int max) {
        maxNumberOfOperations = n;
        maxValueOfCounter = max;
        StdDraw.line(.05, .05, .95, .05);
        StdDraw.line(.05, .05, .05, .95);
        StdDraw.point(x, y);
    }

    public void increment() {
        if (numberOfOperations < maxNumberOfOperations && count < maxValueOfCounter) {
            numberOfOperations++;
            count++;
            StdDraw.point(x+=0.00005, y+=0.00005);
        }
    }

    public int tally() {
        if (numberOfOperations < maxNumberOfOperations) {
            numberOfOperations++;
            return count;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Value of counter = " + count;
    }

    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(27000, 15000);
        for (int i = 0; i <= 17000; i++) {
            counter.increment();
            if (counter.tally() % 1000 == 0) {
                StdDraw.text(counter.x + .05, counter.y - .03, counter.tally() + "");
            }
        }
    }
}

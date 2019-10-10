package part1._1_basic_programming_model.exercises;

/**
 * 1.1.11. Write a code fragment that prints the contents of a two-dimensional boolean
 * array, using * to represent true and a space to represent false. Include row and
 * column numbers.
 **/
public class Exercise_1_1_11 {
    public static void main(String[] args) {

        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));

        boolean[][] array = {
                {true, false, true, false, true},
                {false, true, false, true, false},
                {true, false, true, false, true},
                {false, true, false, true, false},
                {true, false, true, false, true},
        };

        System.out.print("  ");
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

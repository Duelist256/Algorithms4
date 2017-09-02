package part1._1_basic_programming_model.exercises;

/**
 * Created by Duelist on 02.09.2017.
 */
public class Exercise1111 {
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

package part1._1_basic_programming_model.exercises;

/**
 * 1.1.13 Write a code fragment to print the transposition (rows and
 * columns changed) of a two-dimensional array with M rows and N columns.
 **/

public class Exercise_1_1_13 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 9},
                {3, 4, 8},
                {5, 6, 7},
                {7, 8, 6}
        };

        printTransposeArray(arr);
    }

    private static void printTransposeArray(int[][] arr) {
        if (arr == null || arr.length <= 0) {
            return;
        }

        int temp = arr[0].length;
        for (int i = 1; i < arr.length; i++) {
            if (temp != arr[i].length) {
                return;
            }
            temp = arr[i].length;
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}

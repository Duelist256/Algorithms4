package part1._1_basic_programming_model.exercises;

/* *
 * 1.1.30 Array exercise. Write a code fragment that creates an N-by-N boolean array
 * a[][] such that a[i][j] is true if i and j are relatively prime (have no common factors),
 * and false otherwise.
 * */

public class Exercise_1_1_30 {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }


    public static void main(String[] args) {
        boolean[][] arr = new boolean[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (gcd(i, j) == 1) {
                    arr[i][j] = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

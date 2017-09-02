package part1._1_basic_programming_model.exercises;

/**
 * Created by Duelist on 02.09.2017.
 */
public class Exercise_1_1_9 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;
        System.out.println(sum);

        int number = 97;
        String binary = decToBin(number);
        System.out.println(binary);
    }

    private static String decToBin(int number) {
        String str = "";

        while (number != 0) {
            str = number % 2 + str;
            number /= 2;
        }


        return str;
    }
}

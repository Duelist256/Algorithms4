package part1._2_data_abstraction.exercises;

/**
 * 1.2.19 Parsing. Develop the parse constructors for your Date and Transaction implementations
 * of Exercise 1.2.13 that take a single String argument to specify the
 * initialization values, using the formats given in the table below.
 **/

public class Exercise_1_2_19 {
    public static void main(String[] args) {
        Date date = new Date("5/22/1939");
        NewTransaction transaction = new NewTransaction("Turing 5/22/1939 11.99");
        System.out.println(date);
        System.out.println(transaction);
    }
}

class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(String date) {

        String[] data = date.split("/");

        this.month = Integer.valueOf(data[0]);
        this.day = Integer.valueOf(data[1]);
        this.year = Integer.valueOf(data[2]);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

class NewTransaction {
    private final String name;
    private final Date date;
    private final double amount;

    public NewTransaction(String transaction) {

        String[] data = transaction.split(" ");

        this.name = data[0];
        this.date = new Date(data[1]);
        this.amount = Double.valueOf(data[2]);
    }

    @Override
    public String toString() {
        return name + " " + date.toString() + " " + amount;
    }
}


package part1._2_data_abstraction.exercises;

import edu.princeton.cs.algs4.Date;

/**
 * 1.2.13 Using our implementation of Date as a model (page 91), develop an implementation
 * of Transaction.
 *
 * 1.2.14 Using our implementation of equals() in Date as a model (page 103), develop
 * implementations of equals() for Transaction.
 **/

public class Transaction {

    private final String name;
    private final Date date;
    private final double amount;

    public Transaction(String who, Date when, double amount) {
        name = who;
        date = when;
        this.amount = amount;
    }

    public String who() {
        return name;
    }

    public Date when() {
        return date;
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return name + " " + date.toString() + " " + amount;
    }

    public boolean equals(Object x) {

        if (this == x) {
            return true;
        }

        if (x == null) {
            return false;
        }

        if (this.getClass() != x.getClass()) {
            return false;
        }

        Transaction that = (Transaction) x;

        if (!this.name.equals(that.name)) {
            return false;
        }

        if (!this.date.equals(that.date)) {
            return false;
        }

        if (this.amount!= that.amount) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("Petya", new Date(7, 12, 2014), 105.54);
        Transaction transaction2 = new Transaction("Vasya", new Date(4, 21, 2013), 63.31);
        System.out.println(transaction1.equals(transaction2));
        Transaction transaction3 = new Transaction("Petya", new Date(7, 12, 2014), 105.54);
        System.out.println(transaction1.equals(transaction3));
    }
}

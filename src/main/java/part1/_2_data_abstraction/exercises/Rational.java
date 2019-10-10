package part1._2_data_abstraction.exercises;

/**
 * 1.2.16 Rational numbers. Implement an immutable data type Rational for rational
 * numbers that supports addition, subtraction, multiplication, and division.
 **/

public class Rational {
    private final long numerator;
    private final long denominator;

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational plus(Rational b) {
        long lcm = lcm(this.denominator, b.denominator);
        long newNumerator = this.numerator * (lcm / this.denominator) + b.numerator * (lcm / b.denominator);
        long newDenominator = lcm;

        long gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational minus(Rational b) {
        long lcm = lcm(this.denominator, b.denominator);
        long newNumerator = this.numerator * (lcm / this.denominator) - b.numerator * (lcm / b.denominator);
        long newDenominator = lcm;

        long gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational times(Rational b) {
        long newNumerator = this.numerator * b.numerator;
        long newDenominator = this.denominator * b.denominator;

        long gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational divides(Rational b) {
        long newNumerator = this.numerator * b.denominator;
        long newDenominator = this.denominator * b.numerator;

        long gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;

        return new Rational(newNumerator, newDenominator);
    }

    private static long gcd(long p, long q) {
        if (q == 0) {
            return p;
        }
        long r = p % q;
        return gcd(q, r);
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long a, long b, long gcd) {
        return a * (b / gcd);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Rational that = (Rational) obj;

        if (this.numerator != that.numerator) {
            return false;
        }

        if (this.denominator != that.denominator) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Rational a = new Rational(1, 1);
        Rational b = new Rational(1, 2);

        System.out.println(a.equals(b));
        System.out.println(a.equals(new Rational(1, 1)));
        System.out.println(b.equals(new Rational(1, 2)));

        Rational result = a.plus(b);
        System.out.println(result);
        System.out.println(new Rational(1, 256).plus(new Rational(7, 256)));
        System.out.println(new Rational(3, 2).plus(new Rational(1, 2)));

        System.out.println(new Rational(3, 2).minus(new Rational(1, 2)));
        System.out.println(new Rational(1, 1).minus(new Rational(1, 1024)));

        System.out.println(new Rational(1, 256).times(new Rational(256, 1)));
        System.out.println(new Rational(127, 256).times(new Rational(2, 1)));

        System.out.println(new Rational(32, 1).divides(new Rational(2, 1)));
        System.out.println(new Rational(32, 1).divides(new Rational(1, 2)));

    }
}

import java.util.*;
import java.lang.Math;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to print square of given number.

        double a = sc.nextDouble();

        double sqr = a * a;

        // using math function

        double square = Math.pow(a, 2);

        System.out.println("using conventional method = " + sqr);
        System.out.println("using math function = " + square);
        sc.close();

    }
}

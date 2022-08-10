import java.util.*;
import java.lang.Math;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to print cube of given number.

        double a = sc.nextDouble();

        double cube = a * a * a;

        // using math function

        double cb = Math.pow(a, 3);

        System.out.println("using conventional method = " + cube);
        System.out.println("using math function = " + cb);
        sc.close();

    }
}

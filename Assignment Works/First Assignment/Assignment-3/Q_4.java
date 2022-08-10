import java.util.*;
import java.lang.Math;

public class Q_4 {
    public static void main(String[] args) {
        // WAP a program to calculate area of an equilateral triangle.
        Scanner sc = new Scanner(System.in);

        double side = sc.nextDouble();

        double area = Math.sqrt(3) / 4 * side;
        System.out.printf("Area is: %.2f", area);
        sc.close();

    }
}

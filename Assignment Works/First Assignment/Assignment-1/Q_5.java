import java.util.*;
import java.lang.Math;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to enter any number and calculate its square root.
        double num = sc.nextDouble();

        double sqroot = Math.sqrt(num);

        System.out.println(sqroot);

        sc.close();

    }
}

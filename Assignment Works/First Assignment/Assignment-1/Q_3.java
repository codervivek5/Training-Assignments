import java.util.*;
import java.lang.Math;;

public class Q_3 {
    public static void main(String[] args) {
        // A program to enter radius of a circle and find its area.

        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();

        double area = Math.PI * (rad * rad);

        System.out.printf("%.2f", area);
        sc.close();

    }
}

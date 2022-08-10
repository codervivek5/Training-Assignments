import java.util.*;
import java.lang.Math;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        double Q = Math.atan(a / b);
        // System.out.println(Q);

        double rs = (Q * 180) / 3.14;

        rs = Math.round(rs);
        System.out.format("%.0f", rs);
        sc.close();

    }
}

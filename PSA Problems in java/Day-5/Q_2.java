import java.util.*;
import java.lang.Math;
// import java.math.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // k = 1
        // m=2
        // D=83
        // C=19.

        // int k = sc.nextInt();
        // int m = sc.nextInt();
        // int D = sc.nextInt();
        // int C = sc.nextInt();

        // int F = k + ((13 * m - 1) / 5) + D + (D / 4) + (C / 4) - 2 * C;
        // int day = F % 7;
        // int dady = Math.abs(day);
        // System.out.println(day);
        int d, m, y;
        d = sc.nextInt();
        // char slash = sc.next().charAt(0); // error lines (10/12/2022)
        m = sc.nextInt();
        // char slash2 = sc.next().charAt(0); // error lines (10/12/2022)
        y = sc.nextInt();

        // m = month, y = year

        if (m == 1 || m == 2) {
            m = m + 10;
            y = y - 1;

        } else {
            m = m - 2;
        }

        int D = y % 100;
        int C = y / 100;

        int F = d + ((13 * m - 1) / 5) + D + (D / 4) + (C / 4) - 2 * C;
        int rem = Math.abs(F % 7);

        switch (rem) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                break;
        }
        sc.close();
        ;

    }
}

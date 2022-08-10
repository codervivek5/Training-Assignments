
/**
 * Q_4
 */
import java.util.*;

public class Q_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // program to read a 4 digit number from user and perform the sum of their
        // digits.

        int num = sc.nextInt(); // 1234

        int a = num / 1000;
        int b = num % 1000; // ------

        int d = b / 100;
        int e = d % 100;

        int f = b / 10;
        int trd = f % 10;
        int g = b % 10;

        System.out.println(a + e + g + trd);

        sc.close();

    }
}
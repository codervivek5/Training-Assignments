import java.util.*;
import java.lang.Math;

public class Q_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, rem, sum = 0, i = 0;

        n = sc.nextInt();
        while (n != 0) {
            rem = n % 10;
            if (rem % 2 != 0) {
                sum = sum + rem * Math.pow(10, i);
                i++;
            }

        }

    }
}

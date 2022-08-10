
/**
 * Q_1
 */
import java.util.*;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // WAP a program that accepts two item’s weight (floating points' values) and
        // number
        // of purchase (floating points' values) and calculate the average value of the
        // items.

        float wt1 = sc.nextFloat();
        float wt2 = sc.nextFloat();

        float tot_wt = wt1 + wt2;

        float pr1 = sc.nextFloat();
        float pr2 = sc.nextFloat();

        float tot_pr = pr1 + pr2;

        float avg = tot_wt + tot_pr;

        System.out.println(avg);
        sc.close();

    }
}
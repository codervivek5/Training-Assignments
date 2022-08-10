
/**
 * Q_1
 */
import java.util.*;

public class Q_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Output Format

        // If 1<=n<=9, then print the lowercase English word corresponding to the number
        // (e.g.,
        // one for 1, two for 2, etc.); otherwise, print Greater than 9 instead.

        int n = sc.nextInt();

        if (n <= 9) {
            if (n == 1) {
                System.out.println("one");

            }
            if (n == 2) {
                System.out.println("Two");

            }
            if (n == 3) {
                System.out.println("Three");

            }
            if (n == 4) {
                System.out.println("Four");

            }
            if (n == 5) {
                System.out.println("Five");

            }
            if (n == 6) {
                System.out.println("Six");

            }
            if (n == 7) {
                System.out.println("Seven");

            }
            if (n == 8) {
                System.out.println("Eight");

            }
            if (n == 9) {
                System.out.println("Nine");

            }

        } else {
            System.out.println("Greater than 9");

        }
        sc.close();

    }

}
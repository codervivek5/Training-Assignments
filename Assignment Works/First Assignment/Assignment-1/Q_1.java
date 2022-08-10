
/**
 * Q_1
 */
import java.util.*;

public class Q_1 {

    public static void main(String[] args) {
        // A program to enter two numbers and find their Addition, Subtraction.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = (a + b);
        int sub = (a - b);

        System.out.println(sum);
        System.out.println(sub);
        sc.close();

    }
}
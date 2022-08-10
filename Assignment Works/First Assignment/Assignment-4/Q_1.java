
/**
 * Q_1
 */
import java.util.*;;

public class Q_1 {

    public static void main(String[] args) {
        // 1. Write a program to find the greatest number among two.

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Greatest number is: " + num1);

        } else {
            System.out.println("Smallest number is: " + num1);

        }
        sc.close();

    }
}
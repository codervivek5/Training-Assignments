import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        // program to find input number is even or odd.

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");

        }
        sc.close();

    }
}

import java.util.Scanner;

public class Q_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // program to perform the sum of two number without using plus operator.

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {

            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
        sc.close();
    }
}

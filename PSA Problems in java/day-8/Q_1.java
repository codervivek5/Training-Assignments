import java.util.*;

public class Q_1 {

    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    static int fact(int a) {

        // Scanner sc = new Scanner(System.in);
        // int fact = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= a; i++) {
            a = a * i;
        }
        return a;

        // Returning factorial of a number
    }
}
import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        // Sum and Difference of Two Numbers
        // inp ->
        // 10 4
        // 4.0 2.0

        // out-> 14 6
        // 6.0 2.0

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        int sub = n1 - n2;

        System.out.println(sum + " " + sub);
        // System.out.println();
        sc.close();
    }
}

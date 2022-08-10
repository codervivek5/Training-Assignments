import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // int num = 71923;

        // inp = 71923 -> 7 9 3

        int n1, n2, n3, n4, n5;

        n1 = num % 10;
        n2 = num / 100;
        n3 = n2 % 10;
        n4 = num / 1000;
        n5 = n4 / 10;

        int sum = n5 + n3 + n1;
        int sub = n5 - n3 - n1;

        System.out.println(sum + ", " + -(sub));
        sc.close();

    }
}

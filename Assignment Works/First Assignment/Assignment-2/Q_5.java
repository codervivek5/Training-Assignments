import java.util.*;

public class Q_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // program to read a 4 digit number from user and perform the sum of first and
        // last digits.
        int num = sc.nextInt();

        int frst = num / 1000;
        int lst = num % 10;

        System.out.println(frst + lst);
        sc.close();

    }
}

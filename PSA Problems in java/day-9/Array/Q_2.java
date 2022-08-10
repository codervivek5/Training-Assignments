import java.util.*;

public class Q_2 {

    public static void main(String[] args) {
        // Write a program to find sum of array elements.

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            // System.out.println(number[i]);
            sum = sum + number[i];
        }
        System.out.println(sum);

        // method-2 ...................

        // int sum = 0;
        // int num[] = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i <= num.length; i++) {
        // sum = sum + i;

        // }
        // System.out.println(sum);
        sc.close();

    }
}
import java.util.*;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even_count = 0, odd_count = 0;

        // Write a program to count even and odd elements in array.

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        // Array declaration
        int number[] = new int[size];

        // Storing the number in array

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            // System.out.print();
            if (number[i] % 2 == 0) {
                System.out.println("Even Elements: " + number[i]);
                even_count++;

            }
            // System.out.print("Odd Elements: ");
            else {
                System.out.println("Odd Elements: " + number[i]);
                odd_count++;

            }
        }
        System.out.println("Total Even Elements: " + even_count);
        System.out.println("Total Odd Elements: " + odd_count);
        sc.close();
    }

}

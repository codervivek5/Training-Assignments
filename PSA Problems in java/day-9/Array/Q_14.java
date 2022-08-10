import java.util.*;

public class Q_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to print array in reverse.

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        // Array declaration
        int number[] = new int[size];

        // Storing the number in array

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Original array is: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }

        System.out.println("\nReverce array is: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");

        }
        System.out.println();
        sc.close();

    }
}
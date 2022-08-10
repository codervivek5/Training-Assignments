import java.util.*;

public class Q_3 {

    public static void main(String[] args) {
        // Q3. Write a program to find maximum and minimum element in array.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        // int max, min;

        // This code is use to storing data in array

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        for (int i = 0; i < number.length; i++) {

        }
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    // swap
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;

                }

            }
        }
        // System.out.println("Sorted list of numbers: ");
        // for (int i = 0; i < size; i++) {
        // for finding sorted array
        // }
        System.out.println("max " + number[0] + "min " + number[size - 1]);

        sc.close();
    }
}